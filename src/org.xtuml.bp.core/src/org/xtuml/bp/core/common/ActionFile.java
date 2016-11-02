// ========================================================================
//
//File: ActionFile.java
//
//========================================================================
//
package org.xtuml.bp.core.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.preference.IPreferenceStore;
import org.xtuml.bp.core.CorePlugin;
import org.xtuml.bp.core.Ooaofooa;

public class ActionFile {
	
	private static final String[] DIALECTS = { "masl", "oal" };
	
	private HashMap<String,IFile>       fileMap;
	private HashMap<String,ActionBody>  bodyMap;
	
	public ActionFile( String componentFileName ) {
		fileMap = new HashMap<String,IFile>();
		for ( int i = 0; i < DIALECTS.length; i++ ) {
			IPath actionFilePath = getPathFromComponent(componentFileName, DIALECTS[i]);
			fileMap.put(DIALECTS[i], ResourcesPlugin.getWorkspace().getRoot().getFile(actionFilePath));
		}
	}
	
	public ActionFile( IPath componentPath ) {
		fileMap = new HashMap<String,IFile>();
		for ( int i = 0; i < DIALECTS.length; i++ ) {
			IPath actionFilePath = getPathFromComponent(componentPath, DIALECTS[i]);
			fileMap.put(DIALECTS[i], ResourcesPlugin.getWorkspace().getRoot().getFile(actionFilePath));
		}
	}
	
	public void updateFiles( IPath newPath ) {
		fileMap = new HashMap<String,IFile>();
		for ( int i = 0; i < DIALECTS.length; i++ ) {
			IPath actionFilePath = getPathFromComponent(newPath, DIALECTS[i]);
			fileMap.put(DIALECTS[i], ResourcesPlugin.getWorkspace().getRoot().getFile(actionFilePath));
		}
	}
	
	// get the dialect for this action file manager. This will check to see if actions exist
	// for one dialect, if not it will go to the default dialect
	public String getDialect() {
            String dialect = "";
            Iterator<Map.Entry<String,IFile>> it = fileMap.entrySet().iterator();
            while ( it.hasNext() ) {
                Map.Entry<String,IFile> entry = (Map.Entry<String,IFile>)it.next();
                IFile file = entry.getValue();
                if ( file != null && file.exists() ) {
                    if ( "" == dialect ) {
                        dialect = entry.getKey();
                    }
                    else {
	                return getDefaultDialect(); // more than one action file exists
                    }
                }
            }
            if ( dialect == "" ) {
	        return getDefaultDialect(); // no action file exists
            }
            else {
                return dialect.toLowerCase();
            }
	}
	
	// get the file for this action file manager. This will check to see if actions exist
	// for one dialect, if not it will go to the default dialect
	public IFile getFile() {
		return fileMap.get(getDialect());
	}

        // get all the files for this action file manager
        public IFile[] getAllFiles() {
            return fileMap.values().toArray(new IFile[0]);
        }

        // get all available dialects 
        public static String[] getAvailableDialects() {
            return DIALECTS;
        }

        // get the file for this action file manager with a specific dialect
	public IFile getFile( String dialect ) {
		return fileMap.get(dialect);
	}

        // initialize body map
        public void initBodyMap() {
            bodyMap = new HashMap<String,ActionBody>();
	    for ( int i = 0; i < DIALECTS.length; i++ ) {
	        bodyMap.put(DIALECTS[i], new ActionBody());
	    }
        }

        // close print streams in the body map
        public void closeBodyMap() {
	    for ( int i = 0; i < DIALECTS.length; i++ ) {
                ActionBody ab = getBody( DIALECTS[i] );
                if ( null != ab ) {
                    ab.close();
                }
	    }
        }

        // get the ActionBody instance for the specific dialect
        public ActionBody getBody( String dialect ) {
		return bodyMap.get(dialect);
        }

        // persist all the action bodies to their files
        public void persistActionBodies( IProgressMonitor pm ) throws CoreException {
	    for ( int i = 0; i < DIALECTS.length; i++ ) {
                ActionBody ab = getBody( DIALECTS[i] );
                if ( null != ab ) {
                    InputStream astream = new ByteArrayInputStream(ab.getUpdateData().toByteArray());
                    IFile af = getFile( DIALECTS[i] );
                    if (!af.exists()) {
                        if ( ab.getUpdateData().toByteArray().length != 0 ) {
                            af.create(astream, true, pm);
                        }
                    } else {
                        if ( ab.getUpdateData().toByteArray().length != 0 ) {
                            af.setContents(astream, true, true, pm);
                        }
                        else {
                            af.delete(true, false, pm);
                        }
                    }
                }
            }
        }
	
	public static String getDefaultDialect() {
                IPreferenceStore store = CorePlugin.getDefault().getPreferenceStore();
                String prefDialect = store.getString(BridgePointPreferencesStore.DEFAULT_ACTION_LANGUAGE_DIALECT).toLowerCase();
                if ( Arrays.asList( DIALECTS ).contains( prefDialect ) ) {
                    return prefDialect;
                }
                else if ( DIALECTS.length > 0 ) {
                    return DIALECTS[0];     // if the preference does not match a dialect, use the first dialect in the list
                }
                else {
                    return "";
                }
	}
	
	// get the action file path from the component file path
	public IPath getPathFromComponent( IPath path ) {
		return getPathFromComponent( path, getDialect() );
	}

	public static IPath getPathFromComponent( IPath path, String tag ) {
		if ( null != path ) {
			return path.removeFileExtension().addFileExtension(tag);
		}
		else {
			return null;
		}
	}

	public static IPath getPathFromComponent( IFile file, String tag ) {
		if ( null != file ) {
			return getPathFromComponent(file.getFullPath(), tag);
		}
		else {
			return null;
		}
	}

	public static IPath getPathFromComponent( String fileName, String tag ) {
		return getPathFromComponent(new Path(fileName), tag);
	}
	
	// get the component file path from the action file path
	public static IPath getComponentPath( IPath path ) {
		if ( null != path ) {
			return path.removeFileExtension().addFileExtension(Ooaofooa.MODELS_EXT);
		}
		else {
			return null;
		}
	}

	public static IPath getComponentPath( IFile file ) {
		if ( null != file ) {
			return getComponentPath(file.getFullPath());
		}
		else {
			return null;
		}
	}

	public static IPath getComponentPath( String fileName ) {
		return getComponentPath(new Path(fileName));
	}

        // Inner class ActionBody abstracts the information necessary for persisitng an action body to
        // an action file
        public class ActionBody {

            private PrintStream             bodyPrinter;
	    private ByteArrayOutputStream   updateData;

            public ActionBody() {
                updateData = new ByteArrayOutputStream();
                bodyPrinter = new PrintStream(updateData);
            }

            public PrintStream getBodyPrinter() {
                return bodyPrinter;
            }

            public ByteArrayOutputStream getUpdateData() {
                return updateData;
            }

            public void close() {
                if ( null != bodyPrinter ) {
                    bodyPrinter.close();
                }
            }

        }
}
