package controllers;

import org.play.dependencyinjection.annotations.WithDependencyInjection;

import daos.spi.ITestDao;
import play.*;
import play.mvc.*;
import services.spi.IFirstService;
import views.html.*;

public class Application extends Controller {

	@WithDependencyInjection
	private static IFirstService iFirstService;

	@WithDependencyInjection
	private static ITestDao iTestDao;


    public static Result index() {

    	Logger.info (iFirstService.enteringAtFirstService());
    	Logger.info (iTestDao.enteringAtTestDao());

        return ok (index.render ("Your new application is ready."));
    }

}