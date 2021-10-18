package in.apparelStore.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(className = "logout")
	WebElement logoutBtn;
	
	public void clickLogoutBtn() {
		logoutBtn.click();
	}
	
	@FindBy(id = "search_query_top")
	WebElement searchBox;
	
	public void enterSearchDetail(String string){
		searchBox.clear();
		searchBox.sendKeys(string);
	}
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/button")
	WebElement searchBtn;
	
	public void clickOnSearchBtn() {
		searchBtn.click();	
	}
	
	@FindBy(linkText = "Fashion Manufacturer")
	WebElement manufacturerLink;
	
	public void clickManufacturerLink() {
		manufacturerLink.click();
	}
	
	
	
	
	
}
