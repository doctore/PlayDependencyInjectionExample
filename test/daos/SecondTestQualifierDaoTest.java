package daos;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.play.dependencyinjection.exceptions.DependencyInjectionException;
import org.play.dependencyinjection.resolvers.DependencyInjectionResolver;

import configuration.Constants;
import daos.impl.FirstTestQualifierDao;
import daos.spi.ITestQualifierDao;


public class SecondTestQualifierDaoTest {
	
	private static ITestQualifierDao iTestQualifierDao;


    @BeforeClass
    public static void initTest() throws DependencyInjectionException {

    	DependencyInjectionResolver daoResolver = new DependencyInjectionResolver (Constants.daosInterfacesPath);

    	daoResolver.bind (ITestQualifierDao.class, FirstTestQualifierDao.class)
                   .resolveDependenciesOfInterface (ITestQualifierDao.class, null);

    	iTestQualifierDao = daoResolver.getImplementation (ITestQualifierDao.class, null);
    }


    @Test
    public void enteringAtTestQualifierDaoTest() {

        assertEquals ("First test qualifier dao", iTestQualifierDao.enteringAtTestQualifierDao());
    }

}