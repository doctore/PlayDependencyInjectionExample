package services.alt;

import services.spi.ISecondService;

public class SecondServiceAlt implements ISecondService {


	@Override
	public String enteringAtSecondService() {

		return "Second service alternative";
	}

}