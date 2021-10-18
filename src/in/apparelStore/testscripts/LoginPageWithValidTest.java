package in.apparelStore.testscripts;

import org.testng.annotations.Test;

import in.apparelStore.pages.LandingPage;
import in.apparelStore.pages.LoginPage;

public class LoginPageWithValidTest extends BaseTest{
	@Test
	public void loginTest() {
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickLoginBtn();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterEmailField("abcd21@xyz.com");
		loginPage.enterpasswordField("Abc@1234");
		loginPage.submitLoginBtn();
		
		
	}
}
