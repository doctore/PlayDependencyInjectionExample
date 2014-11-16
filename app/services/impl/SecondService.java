package services.impl;

import org.play.dependencyinjection.annotations.WithDependencyInjection;

import daos.spi.ITestDao;
import services.spi.ISecondService;

public class SecondService implements ISecondService {

	@WithDependencyInjection
	private ITestDao iTestDao;


	@Override
	public String enteringAtSecondService() {

		return "Second service" + " / " + iTestDao.enteringAtTestDao();
	}

}
