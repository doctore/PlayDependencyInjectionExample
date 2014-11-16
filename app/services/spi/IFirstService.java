package services.spi;

import org.play.dependencyinjection.annotations.Injectable;

@Injectable
public interface IFirstService extends IService {

	/**
	 * Checks the dependency injection on {@link IFirstService} 
	 */
	public String enteringAtFirstService();

}