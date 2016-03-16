package services;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.play.dependencyinjection.exceptions.DependencyInjectionException;
import org.play.dependencyinjection.resolvers.DependencyInjectionResolver;

import services.alt.SecondServiceAlt;
import services.impl.FirstService;
import services.spi.IFirstService;
import services.spi.ISecondService;
import configuration.Constants;

public class FirstServiceTest {

	private static IFirstService iFirstService;


    @BeforeClass
    public static void initTest() throws DependencyInjectionException {

    	DependencyInjectionResolver serviceResolver = new DependencyInjectionResolver (Constants.servicesInterfacesPath);

    	serviceResolver.bind (IFirstService.class, FirstService.class, null)
                       .bind (ISecondService.class, SecondServiceAlt.class, null)
                       .resolveDependenciesOfInterface (IFirstService.class, null);

        iFirstService = serviceResolver.getImplementation (IFirstService.class, null);
    }


    @Test
    public void enteringAtFirstServiceTest() {

        assertEquals ("First service / Second service alternative", iFirstService.enteringAtFirstService());
    }

}