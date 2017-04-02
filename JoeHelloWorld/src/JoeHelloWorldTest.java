import static org.junit.Assert.*;

import org.junit.Test;

public class JoeHelloWorldTest {

	final private String NAME = "Fred";
	final private String EXPECTED_RESULT = "Hello Fred";
	final private String BLANK_NAME = "";
	final private String EXPECTED_RESPONSE = "Hello ";
	
	@Test
	public void helloWorldTest() { assertEquals(EXPECTED_RESULT, joeHelloWorld.helloWorld(NAME)); }
	@Test
	public void helloWorldNegativeTest() { assertEquals(EXPECTED_RESPONSE, joeHelloWorld.helloWorld(BLANK_NAME)); }

}