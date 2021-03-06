package in.apparelStore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(className = "login")
	WebElement loginBtn;
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	
	
}
