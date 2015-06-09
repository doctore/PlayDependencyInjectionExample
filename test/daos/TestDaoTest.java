package daos;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.play.dependencyinjection.exceptions.DependencyInjectionException;
import org.play.dependencyinjection.resolvers.DependencyInjectionResolver;

import configuration.Constants;
import daos.impl.TestDao;
import daos.spi.ITestDao;


public class TestDaoTest {

	private static ITestDao iTestDao;


    @BeforeClass
    public static void initTest() throws DependencyInjectionException {

    	DependencyInjectionResolver daoResolver = new DependencyInjectionResolver (Constants.daosInterfacesPath);

    	daoResolver.bind (ITestDao.class, TestDao.class)
                   .resolveDependenciesOfInterface (ITestDao.class, null);

    	iTestDao = daoResolver.getImplementation (ITestDao.class, null);
    }


    @Test
    public void enteringAtTestDaoTest() {

        assertEquals ("Test dao", iTestDao.enteringAtTestDao());
    }

}