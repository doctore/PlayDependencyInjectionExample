package services.alt;

import services.spi.IFirstService;

public class FirstServiceAlt implements IFirstService {


	@Override
	public String enteringAtFirstService() {

		return "First service alternative";
	}

}
