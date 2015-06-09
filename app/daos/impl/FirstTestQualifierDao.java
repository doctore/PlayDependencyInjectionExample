package daos.impl;

import daos.spi.ITestQualifierDao;

public class FirstTestQualifierDao implements ITestQualifierDao {


	@Override
	public String enteringAtTestQualifierDao() {

		return "First test qualifier dao";
	}

}