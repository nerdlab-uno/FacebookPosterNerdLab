package laNerdeadaFacePoster;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FacebookPoster {
	
private WebDriver driver;
private String key="Noe420472";
private String usuario= "1122754695";
	
	@Before
	public void setUp() {
		
		
		ChromeOptions options = new ChromeOptions();

		//Then Add chrome switch to disable notification - "--disable-notifications"

		options.addArguments("--disable-notifications");

		//After that set path for driver exe
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromeDriver/chromedriver.exe");
		

		//and then pass ChromeOptions instance to ChromeDriver Constructor

	
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	
	public void testFacebookPage() throws InterruptedException {
		
		//poniendo el usuario en el textField de Facebook
		
		WebElement usuarioFace = driver.findElement(By.id("email"));
		usuarioFace.clear();
		usuarioFace.sendKeys(usuario);
		
		//poniendo la key en el texField de Facebook
		WebElement keyFace = driver.findElement(By.id("pass"));
		keyFace.clear();
		keyFace.sendKeys(key);
		keyFace.submit();
		
		Thread.sleep(20000);
	
		
		/*Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		action.sendKeys(Keys.ESCAPE).perform();*/
		
		//click en el boton log in
		
		//WebElement btnFace = driver.findElement(By.id("u_0_b"));
		//btnFace.click();
		
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//assertEquals("diario clarin", driver.getTitle());
		
	}
	
	@After
	
	public void tearDown() {
		//driver.quit();
	}
	
	

}
