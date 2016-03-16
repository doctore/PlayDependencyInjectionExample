package services;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.play.dependencyinjection.DependencyInjectionPool;
import org.play.dependencyinjection.exceptions.DependencyInjectionException;
import org.play.dependencyinjection.resolvers.DependencyInjectionResolver;

import services.impl.ThirdService;
import services.spi.IThirdService;
import configuration.Constants;

public class ThirdServiceTest {

	private static IThirdService iThirdService;


    @BeforeClass
    public static void initTest() throws DependencyInjectionException {

		DependencyInjectionPool.instance().addNewResolver (new DependencyInjectionResolver (Constants.daosInterfacesPath
						                                                                   ,Constants.daosAlternativePath))

                                          .addNewResolver (new DependencyInjectionResolver (Constants.servicesInterfacesPath));

		DependencyInjectionResolver serviceResolver = DependencyInjectionPool.instance().getResolver (Constants.servicesInterfacesPath);

		serviceResolver.bind (IThirdService.class, ThirdService.class, null)
		               .resolveDependenciesOfInterface (IThirdService.class, null);

        iThirdService = serviceResolver.getImplementation (IThirdService.class, null);
    }


    @Test
    public void enteringAtThirdServiceTest() {

        assertEquals ("Third service / First test qualifier dao alternative / Second test qualifier dao alternative"
        		     ,iThirdService.enteringAtThirdService());
    }

}