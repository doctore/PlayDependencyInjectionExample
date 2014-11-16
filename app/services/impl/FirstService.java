package services.impl;

import org.play.dependencyinjection.annotations.WithDependencyInjection;

import services.spi.IFirstService;
import services.spi.ISecondService;

public class FirstService implements IFirstService {

	@WithDependencyInjection
	private ISecondService iSecondService;


	@Override
	public String enteringAtFirstService() {

		return "First service" + " / " + iSecondService.enteringAtSecondService();
	}

}
