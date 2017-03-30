package org.xtuml.bp.cli;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.PlatformUI;
import java.io.FileOutputStream;
import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Path;
import org.xtuml.bp.core.SystemModel_c;
import org.xtuml.bp.utilities.ui.ProjectUtilities;

public class ImportExecutor implements Executor {
    
    private BPCLIPreferences cmdLine;

    private String projectPath;
    private IProject project;
    private String filePath;
    private String targetProjectName;

    protected ImportExecutor(BPCLIPreferences prefs) {
        cmdLine = prefs;
        projectPath = cmdLine.getStringValue("-project");
        filePath = cmdLine.getStringValue("-file");
        targetProjectName = cmdLine.getStringValue("-targetProject");
    }

    public void execute() {
        try {
            if (!projectPath.isEmpty()) {
                importProject();
            } else if (!filePath.isEmpty()) {
                importFile();
            } else {
                throw new BPCLIException("You must specify either a project or file to import.");
            }
        } catch (CoreException e) {
            System.err.println(e.getMessage());
        } catch (BPCLIException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private void importProject() throws CoreException, BPCLIException, IOException {
        // verifier the source exists and is a Folder
        File source = new File(projectPath);
        if(!source.exists() || !source.isDirectory()) {
            throw new BPCLIException("The source project does not exist.");
        }
        IProjectDescription description = ResourcesPlugin
                .getWorkspace().loadProjectDescription( new Path(projectPath+"/.project"));
        IProject project = ResourcesPlugin.getWorkspace()
                .getRoot().getProject(description.getName());
        project.create(description, null);
        project.open(null);
    }

    private void copyFolder(File src, File dest) throws IOException {
        if (src.isDirectory()) {
            if (!dest.exists()) {
                dest.mkdir();
            }
            String files[] = src.list();
            for (String file : files) {
                File srcFile = new File(src, file);
                File destFile = new File(dest, file);
                copyFolder(srcFile, destFile);
            }
        } else {
            if (!dest.exists()) {
                dest.createNewFile();
            }
            InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            in.close();
            out.close();
        }        
    }

    private String getProjectNameFromPath() {
        Path path = new Path(projectPath);
        return path.lastSegment();
    }

    private void importFile() throws CoreException, BPCLIException, IOException {
        // verifier the specified file exists
        File sourceFile = new File(filePath);
        if(!sourceFile.exists() || !sourceFile.isFile()) {
            throw new BPCLIException("The source file does not exist.");
        }
        if (targetProjectName.isEmpty()) {
            // No target project given, use the name of the file as the project name
            targetProjectName = sourceFile.getName();
            targetProjectName = FilenameUtils.removeExtension(targetProjectName); 
        }
        
        System.out.println("Importing file into project: " + targetProjectName);
        project = ResourcesPlugin.getWorkspace().getRoot().getProject(targetProjectName);
        if (project.exists()) {
            if (cmdLine.getBooleanValue("-deleteExisting")) {
                project.delete(true, true, new NullProgressMonitor());
            } 
        } 
        if (!project.exists()) {
            throw new BPCLIException("The single file import requires the target project already exist.");
        }
        
        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
            
            @Override
            public void run() {
                // Import the file into the project
                SystemModel_c systemModel = ProjectUtilities.getSystemModel(project);
                System.out.println("The system model is " + systemModel.getName());
                try {
                    project.open(new NullProgressMonitor());
                    project.refreshLocal(IResource.DEPTH_INFINITE, null);

                    System.out.println("Proceeding with import of " + filePath);
                    boolean setupSucceeded = ProjectUtilities.importModelUsingWizard(systemModel, filePath, false);
                    if(!setupSucceeded) {
                        throw new BPCLIException("The import process failed.");
                    }
                    
                    ProjectUtilities.allowJobCompletion();

                } catch (CoreException e) {
                    System.out.println(e.toString());
                } catch (BPCLIException e) {
                    System.out.println(e.toString());
                }
            }
        });        
    }
}