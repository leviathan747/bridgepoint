/**
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.xtext;

import org.xtuml.bp.xtext.MaslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MaslStandaloneSetup extends MaslStandaloneSetupGenerated {
  public static void doSetup() {
    MaslStandaloneSetup _maslStandaloneSetup = new MaslStandaloneSetup();
    _maslStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}