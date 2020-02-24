package FacebookPoster;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class FacebookPosterPage extends FacebookPosterBase{

		By userLocator = By.id("email");
		By passLocator = By.id("pass");
		By homePageLocator = By.linkText("Inicio");
		By logInBtnLocator = By.id("u_0_2");
		private String group = "https://www.facebook.com/groups/clasificadosdemerlo/";
		By searchInputLocator = By.name("q");
		By iniciarConversacionLocator = By.linkText("Iniciar conversación");
		By inputConversacionLocator= By.className("_40eu");
		By publishBtnLocator = By.linkText("Publicar");
		
		
		public FacebookPosterPage(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}
		
		public void signIn() throws Exception {
			if(isDisplayed(userLocator)) {
				//agregar mas adelante 2 variables para guardar los datos de usuario y contraseña
				type("1161003079", userLocator);
				type("bnm123123", passLocator);
				submit(passLocator);
			}else {
				System.out.println("El texto del usuario no se encuentra");
			}
		}
		
		public void findGroup() throws InterruptedException {
			Thread.sleep(2000);
			visit(group);
		}
		
		public boolean isHomePageDisplayed() {
			return isDisplayed(homePageLocator);
		}
		
		public String isGroupPageDisplayed() {
			return title();
		}
		
		public void publish(String txtUrl) throws InterruptedException {
			Thread.sleep(10000);
			click(iniciarConversacionLocator);
			Thread.sleep(15000);
			click(inputConversacionLocator);
			type(txtUrl, inputConversacionLocator);
			Thread.sleep(10000);
			click(publishBtnLocator);
			
		}

	}


