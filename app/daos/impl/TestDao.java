package daos.impl;

import daos.spi.ITestDao;

public class TestDao implements ITestDao {


	@Override
	public String enteringAtTestDao() {

		return "Test dao";
	}

}