package services.alt;

import services.spi.IThirdService;

public class ThirdServiceAlt implements IThirdService {


	@Override
	public String enteringAtThirdService() {

		return "Third service alternative";
	}

}