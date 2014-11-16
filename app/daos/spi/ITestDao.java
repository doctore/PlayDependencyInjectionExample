package daos.spi;

import org.play.dependencyinjection.annotations.Injectable;

@Injectable
public interface ITestDao {

	/**
	 * Checks the dependency injection on {@link ITestDao} 
	 */
	public String enteringAtTestDao();

}