package daos.alt;

import daos.spi.ITestQualifierDao;

public class FirstTestQualifierDaoAlt implements ITestQualifierDao {


	@Override
	public String enteringAtTestQualifierDao() {

		return "First test qualifier dao alternative";
	}

}