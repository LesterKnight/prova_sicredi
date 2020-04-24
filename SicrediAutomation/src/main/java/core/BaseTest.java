package core;

import org.junit.After;
import org.junit.Before;

public class BaseTest extends BaseDriver{
@Before
	public void setup() {
	startBrowser();
	}
@After
	public void tearDown() {
	closeBrowser();
	}
}
