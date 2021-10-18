package in.apparelStore.testscripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import in.apparelStore.pages.CreateAccountPage;
import in.apparelStore.pages.LandingPage;
import in.apparelStore.pages.UserPage;
import in.apparelStore.utils.ReadData;

public class AccountCreationPostCodeLessThan4Test extends BaseTest{
	@Test
	public void createAccountTest() throws IOException {
		
				
		
		ReadData readCSVData = new ReadData();
		List<String[]> testData = readCSVData.readCSVData("TestData/TestPostCode.csv");		
		
		for(String[] data: testData) {
				
			String email = data[0];
			
			String firstname = data[1];
			String lastname = data[2];
			String password = data[3];
			
			String day = data[4];
			String month = data[5];
			String year = data[6];
			
			String address = data[7];
			String city = data[8];
			
			String state = data[9];
			String postcode = data[10];
			String country = data[11];
			
			String mobile = data[12];
			String aliasAddress = data[13];
			
			LandingPage landingPage = new LandingPage(driver);
			landingPage.clickLoginBtn();
			
			CreateAccountPage createAccountPage = new CreateAccountPage(driver);
			
			createAccountPage.enterEmail(email);
			createAccountPage.clickSubmitBtn();

			
			
			WebDriverWait wait = new WebDriverWait(driver,60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@type,'radio')])[1]")));
			
			createAccountPage.clickTitleBtn();
			
			createAccountPage.enterFirstname(firstname);
			createAccountPage.enterLastname(lastname);
			createAccountPage.enterPassword(password);
			
			createAccountPage.selectDay(day);
			createAccountPage.selectMonth(month);
			createAccountPage.selectYear(year);
			
			createAccountPage.clickNewsLetter();
			createAccountPage.clickSpecialOffer();
			
			createAccountPage.enterAddress(address);
			createAccountPage.enterCity(city);
			
			createAccountPage.selectState(state);
			createAccountPage.enterPostcode(postcode);
			createAccountPage.selectCountry(country);
			
			createAccountPage.enterMobileNum(mobile);
			createAccountPage.enterAliasAddress(aliasAddress);
			
			createAccountPage.clickSubmitAccount();
			
		}			
	}
}
