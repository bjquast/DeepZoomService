/**
 * 
 */
package deepzoomer;

import de.nrw.hbz.deepzoomer.serviceImpl.Configuration;
import de.nrw.hbz.deepzoomer.util.DziResult;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @author aquast
 *
 */
public class TestDziResult {

	// Initiate Logger for TestRestClient
	private static Logger log = Logger.getLogger(TestDziResult.class);
	
		@Test
		public void getDziResult(){
			String testFileName = "src/test/resources/dzi/test";
			DziResult dzi = new DziResult(testFileName);
			log.info(dzi.toString());
		}
	
	/**
	 * <p><em>Title: </em></p>
	 * <p>Description: </p>
	 * 
	 * @param args 
	 */
	public static void main(String[] args) {
		//Configuration.initLog();
		TestDziResult dziResult= new TestDziResult();
		

	}


}
