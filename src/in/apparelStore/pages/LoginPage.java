package in.apparelStore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id = "email")
	WebElement emailField;
	
	public void enterEmailField(String string){
		emailField.clear();
		emailField.sendKeys(string);
	}
	
	@FindBy(id = "passwd")
	WebElement passwordField;
	
	public void enterpasswordField(String string) {
		passwordField.clear();
		passwordField.sendKeys(string);
	}

	@FindBy(id = "SubmitLogin")
	WebElement submitLoginBtn;
	
	public void submitLoginBtn() {
		submitLoginBtn.click();
	}
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")
	WebElement errorMessage;
	
	public String errorMessageCheck(){
		String actualText = errorMessage.getText();
		return actualText;
	}
}
