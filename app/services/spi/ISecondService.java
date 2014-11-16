package services.spi;

import org.play.dependencyinjection.annotations.Injectable;

@Injectable
public interface ISecondService extends IService {

	/**
	 * Checks the dependency injection on {@link ISecondService} 
	 */
	public String enteringAtSecondService();

}