package daos.alt;

import org.play.dependencyinjection.annotations.DependencyInjectionQualifier;

import daos.spi.ITestQualifierDao;

@DependencyInjectionQualifier("secondTestQualifierDao")
public class SecondTestQualifierDaoAlt implements ITestQualifierDao {


	@Override
	public String enteringAtTestQualifierDao() {

		return "Second test qualifier dao alternative";
	}

}