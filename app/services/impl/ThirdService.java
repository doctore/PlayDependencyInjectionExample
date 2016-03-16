package services.impl;

import org.play.dependencyinjection.annotations.WithDependencyInjection;

import services.spi.IThirdService;
import daos.spi.ITestQualifierDao;

public class ThirdService implements IThirdService {

	@WithDependencyInjection
	private static ITestQualifierDao firstTestQualifierDao;

	@WithDependencyInjection("secondTestQualifierDao")
	private static ITestQualifierDao secondTestQualifierDao;


	@Override
	public String enteringAtThirdService() {

		return "Third service" + " / " + firstTestQualifierDao.enteringAtTestQualifierDao()
		     + " / " + secondTestQualifierDao.enteringAtTestQualifierDao();
	}

}