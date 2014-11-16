import org.play.dependencyinjection.DependencyInjectionPool;
import org.play.dependencyinjection.exceptions.DependencyInjectionException;
import org.play.dependencyinjection.resolvers.DependencyInjectionResolver;

import configuration.Constants;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.mvc.Controller;
import services.spi.IService;

public class Global extends GlobalSettings {


	@Override
	public void onStart (Application app) {

		try {
			// Initializes the dependency injection
			DependencyInjectionPool.instance().addNewResolver (new DependencyInjectionResolver (Constants.daosInterfacesPath
					                                                                           ,Constants.daosImplementationPath))

					                          .addNewResolver (new DependencyInjectionResolver (Constants.servicesInterfacesPath
					                        		                                           ,Constants.servicesImplementationPath
					                        		                                           ,IService.class))

								              .initializeControllersResolver (Constants.controllersImplementationPath
								            		                         ,Controller.class);

		} catch (DependencyInjectionException e) {
			Logger.error ("Error when initializes the dependency injection", e);
		}
	}

}