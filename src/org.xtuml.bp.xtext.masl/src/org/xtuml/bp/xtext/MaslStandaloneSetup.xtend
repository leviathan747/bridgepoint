/*
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MaslStandaloneSetup extends MaslStandaloneSetupGenerated {

	def static void doSetup() {
		new MaslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
