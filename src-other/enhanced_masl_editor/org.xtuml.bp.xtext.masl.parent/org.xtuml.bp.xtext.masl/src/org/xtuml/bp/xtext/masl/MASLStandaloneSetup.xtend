/*
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MASLStandaloneSetup extends MASLStandaloneSetupGenerated {

	def static void doSetup() {
		new MASLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
