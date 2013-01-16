
package org.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class HighwayStandaloneSetup extends HighwayStandaloneSetupGenerated{

	public static void doSetup() {
		new HighwayStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

