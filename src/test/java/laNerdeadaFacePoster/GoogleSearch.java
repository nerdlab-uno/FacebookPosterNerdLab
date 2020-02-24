package laNerdeadaFacePoster;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@Test
	
	public void testGooglePage() {
		WebElement cajaBusqueda = driver.findElement(By.name("q"));
		cajaBusqueda.clear();
		cajaBusqueda.sendKeys("diario clarin");
		cajaBusqueda.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("diario clarin", driver.getTitle());
		
	}
	
	@After
	
	public void tearDown() {
		//driver.quit();
	}
	
	
	
	
}
