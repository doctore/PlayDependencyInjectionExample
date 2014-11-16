package daos.alt;

import daos.spi.ITestDao;

public class TestDaoAlt implements ITestDao {


	@Override
	public String enteringAtTestDao() {

		return "Test dao alternative";
	}

}