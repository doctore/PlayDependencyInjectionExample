package daos.impl;

import org.play.dependencyinjection.annotations.DependencyInjectionQualifier;

import daos.spi.ITestQualifierDao;

@DependencyInjectionQualifier("secondTestQualifierDao")
public class SecondTestQualifierDao implements ITestQualifierDao {


	@Override
	public String enteringAtTestQualifierDao() {

		return "Second test qualifier dao";
	}

}