
package org.xtext.example.mydsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class XHighwayStandaloneSetup extends XHighwayStandaloneSetupGenerated{

	public static void doSetup() {
		new XHighwayStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

