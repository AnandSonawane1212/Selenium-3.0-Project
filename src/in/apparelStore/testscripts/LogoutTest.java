package in.apparelStore.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.apparelStore.pages.LandingPage;
import in.apparelStore.pages.LoginPage;
import in.apparelStore.pages.UserPage;

public class LogoutTest extends BaseTest{
	
	@Test
	public void logoutTest() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickLoginBtn();
		
		LoginPage login = new LoginPage(driver);
		login.enterEmailField("abcd21@xyz.com");
		login.enterpasswordField("Abc@1234");
		login.submitLoginBtn();
		
		UserPage user = new UserPage(driver);
		user.clickLogoutBtn();
		
	}

}
