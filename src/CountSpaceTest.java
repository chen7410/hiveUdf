

import static org.junit.Assert.*;

import org.apache.hadoop.io.Text;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.CountSpace;

public class CountSpaceTest {

	private CountSpace cs = new CountSpace();
	private String airportName =  "Jose Aponte de la Torre Airport";
//	private Text airportNameText = new Text(airportName);
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEvaluateAirportName() {
		assertEquals("Jose1Aponte2de3la4Torre5Airport", 
				cs.evaluate(airportName));
		//		System.out.println("\n" + cs.evaluate(airportNameText).toString());
	}
	
//	@Test
//	public void testEvaluateNull() {
//		assertEquals(null, 
//				cs.evaluate(null));
//	}
//	
//	@Test
//	public void testEvaluateEmptyString() {
//		assertEquals(null, 
//				cs.evaluate(new Text("")));
//	}

}
