package daos.spi;

import org.play.dependencyinjection.annotations.Injectable;

@Injectable
public interface ITestQualifierDao {

	/**
	 * Checks the dependency injection on {@link ITestQualifierDao} 
	 */
	public String enteringAtTestQualifierDao();

}