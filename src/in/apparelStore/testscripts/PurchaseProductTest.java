package in.apparelStore.testscripts;


import org.testng.annotations.Test;

import in.apparelStore.pages.LandingPage;
import in.apparelStore.pages.LoginPage;
import in.apparelStore.pages.ProductPage;
import in.apparelStore.pages.UserPage;

public class PurchaseProductTest extends BaseTest{
	@Test
	public void purchaseProductTest() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickLoginBtn();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterEmailField("abcd21@xyz.com");
		loginPage.enterpasswordField("Abc@1234");
		loginPage.submitLoginBtn();
		
		UserPage user = new UserPage(driver);
		user.enterSearchDetail("man");
		user.clickOnSearchBtn();
		
		ProductPage product = new ProductPage(driver);
		product.clickProductLink();
		
		product.addToCart();
	}
}
