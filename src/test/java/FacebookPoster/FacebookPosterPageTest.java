package FacebookPoster;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class FacebookPosterPageTest {

	private WebDriver driver;
	FacebookPosterPage page;
	
	@Before
	public void setUp() throws Exception {
		page = new FacebookPosterPage(driver);
		driver = page.chromeDriverConnection();
		page.visit("http://www.facebook.com");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	} 

	@Test
	public void test() throws Exception {
		page.signIn();
		Thread.sleep(10000);
		assertTrue(page.isHomePageDisplayed());

		page.findGroup();
		assertEquals("CLASIFICADOS DE MERLO", page.isGroupPageDisplayed());
		
		page.publish("hello world");
		
	}
	
	/*@Test
	public void group_test() throws InterruptedException {
		signIn.publishGroup();
		//assertEquals("CLASIFICADOS DE MERLO",signIn.isGroupPageDisplayed());
	}*/
	

}