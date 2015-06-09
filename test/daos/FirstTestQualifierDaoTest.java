package daos;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.play.dependencyinjection.exceptions.DependencyInjectionException;
import org.play.dependencyinjection.resolvers.DependencyInjectionResolver;

import configuration.Constants;
import daos.impl.SecondTestQualifierDao;
import daos.spi.ITestQualifierDao;


public class FirstTestQualifierDaoTest {
	
	private static ITestQualifierDao iTestQualifierDao;


    @BeforeClass
    public static void initTest() throws DependencyInjectionException {

    	DependencyInjectionResolver daoResolver = new DependencyInjectionResolver (Constants.daosInterfacesPath);

    	daoResolver.bind (ITestQualifierDao.class, SecondTestQualifierDao.class)
                   .resolveDependenciesOfInterface (ITestQualifierDao.class, null);

    	iTestQualifierDao = daoResolver.getImplementation (ITestQualifierDao.class, null);
    }


    @Test
    public void enteringAtTestQualifierDaoTest() {

        assertEquals ("Second test qualifier dao", iTestQualifierDao.enteringAtTestQualifierDao());
    }

}