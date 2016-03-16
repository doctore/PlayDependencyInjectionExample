package services;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.play.dependencyinjection.DependencyInjectionPool;
import org.play.dependencyinjection.exceptions.DependencyInjectionException;
import org.play.dependencyinjection.resolvers.DependencyInjectionResolver;

import services.impl.SecondService;
import services.spi.ISecondService;
import configuration.Constants;

public class SecondServiceTest {

	private static ISecondService iSecondService;


    @BeforeClass
    public static void initTest() throws DependencyInjectionException {

		DependencyInjectionPool.instance().addNewResolver (new DependencyInjectionResolver (Constants.daosInterfacesPath
						                                                                   ,Constants.daosAlternativePath))

                                          .addNewResolver (new DependencyInjectionResolver (Constants.servicesInterfacesPath));

		DependencyInjectionResolver serviceResolver = DependencyInjectionPool.instance().getResolver (Constants.servicesInterfacesPath);

		serviceResolver.bind (ISecondService.class, SecondService.class, null)
		               .resolveDependenciesOfInterface (ISecondService.class, null);

        iSecondService = serviceResolver.getImplementation (ISecondService.class, null);
    }


    @Test
    public void enteringAtSecondServiceTest() {

        assertEquals ("Second service / Test dao alternative", iSecondService.enteringAtSecondService());
    }

}