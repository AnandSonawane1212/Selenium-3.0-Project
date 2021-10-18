package in.apparelStore.testscripts;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.apparelStore.pages.LandingPage;
import in.apparelStore.pages.LoginPage;
import in.apparelStore.utils.ReadData;

public class LoginPageWithInvalidTest extends BaseTest{
	@Test
	public void loginTest() throws IOException{
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickLoginBtn();
		
		LoginPage loginPage = new LoginPage(driver);
		
		ReadData readCSVData = new ReadData();
		List<String[]> testData = readCSVData.readCSVData("TestData/LoginDetails.csv");
		for(String[] data:testData) {
			String username = data[0];
			String password = data[1];
			
			loginPage.enterEmailField(username);
			loginPage.enterpasswordField(password);
			loginPage.submitLoginBtn();
			
		}
//		String expectedText = "Authentication failed.";
//		Assert.assertEquals(loginPage.errorMessageCheck(), expectedText);
	}
}
