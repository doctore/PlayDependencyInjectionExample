package controllers;

import org.play.dependencyinjection.annotations.WithDependencyInjection;

import daos.spi.ITestDao;
import daos.spi.ITestQualifierDao;
import play.*;
import play.mvc.*;
import services.spi.IFirstService;
import views.html.*;

public class Application extends Controller {

	@WithDependencyInjection
	private static IFirstService iFirstService;

	@WithDependencyInjection
	private static ITestDao iTestDao;

	@WithDependencyInjection
	private static ITestQualifierDao firstTestQualifierDao;

	@WithDependencyInjection(qualifier="secondTestQualifierDao")
	private static ITestQualifierDao secondTestQualifierDao;


    public static Result index() {

    	Logger.info ("----------- WITHOUT QUALIFIER -----------");
    	Logger.info (iTestDao.enteringAtTestDao());
    	Logger.info (iFirstService.enteringAtFirstService());

    	Logger.info ("----------- WITH QUALIFIER -----------");
    	Logger.info (firstTestQualifierDao.enteringAtTestQualifierDao());
    	Logger.info (secondTestQualifierDao.enteringAtTestQualifierDao());

        return ok (index.render ("Your new application is ready."));
    }

}