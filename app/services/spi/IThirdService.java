package services.spi;

import org.play.dependencyinjection.annotations.Injectable;

@Injectable
public interface IThirdService extends IService {

	/**
	 * Checks the dependency injection on {@link IThirdService} 
	 */
	public String enteringAtThirdService();

}