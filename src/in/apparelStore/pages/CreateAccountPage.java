package in.apparelStore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPage {
	
	WebDriverWait wait;
	
	public CreateAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id = "email_create")
	WebElement emailField;
	
	@FindBy(id = "SubmitCreate")
	WebElement submitBtn;
	
	@FindBy(xpath = "//*[@id=\"id_gender1\"]")
	WebElement titleRadioBtn;
	
	@FindBy(id = "customer_firstname")
	WebElement firstName;
	
	@FindBy(id = "customer_lastname")
	WebElement lastName;
	
	@FindBy(id = "passwd")
	WebElement password;
	
	@FindBy(id = "days")
	WebElement days;
	
	@FindBy(id = "months")
	WebElement months;
	
	@FindBy(id = "years")
	WebElement years;
	
	@FindBy(id = "newsletter")
	WebElement newsLetter;
	
	@FindBy(id = "optin")
	WebElement specialOffer;
		
	@FindBy(id = "address1")
	WebElement address;
	
	@FindBy(id = "city")
	WebElement city;
	
	@FindBy(id = "id_state")
	WebElement states;
	
	@FindBy(id = "postcode")
	WebElement postcode;
	
	@FindBy(id = "id_country")
	WebElement country;
	
	@FindBy(id = "phone_mobile")
	WebElement mobilePhone;
	
	@FindBy(id = "alias")
	WebElement aliasAddress;
	
	@FindBy(id = "submitAccount")
	WebElement submitAccount;
	

	
	public void enterEmail(String email) {
		emailField.clear();
		emailField.sendKeys(email);
	}
	
	public void clickSubmitBtn() {
		submitBtn.click();
	}
	
	public void clickTitleBtn() {
		titleRadioBtn.click();
	}
	
	public void enterFirstname(String string) {
		firstName.clear();
		firstName.sendKeys(string);
	}
	
	public void enterLastname(String string) {
		lastName.clear();
		lastName.sendKeys(string);
	}
	public void enterPassword(String string) {
		password.clear();
		password.sendKeys(string);
	}
	
	public void selectDay(String string) {
		Select day = new Select(days);
		day.selectByIndex(4);
	}
	
	public void selectMonth(String string) {
		Select month = new Select(months);
		month.selectByIndex(4);
	}
	
	public void selectYear(String string) {
		Select year = new Select(years);
		year.selectByIndex(4);
	}
	
	public void clickNewsLetter() {
		newsLetter.click();
	}
	
	public void clickSpecialOffer() {
		specialOffer.click();
	}
	
	public void enterAddress(String string){
		address.clear();
		address.sendKeys(string);
	}
	
	public void enterCity(String string){
		city.clear();
		city.sendKeys(string);
	}
	
	public void selectState(String string) {
		Select state = new Select(states);
		state.selectByVisibleText(string);
	}
	
	public void enterPostcode(String string) {
		postcode.clear();
		postcode.sendKeys(string);
	}
	
	public void selectCountry(String string) {
		Select countrySelect = new Select(country);
		countrySelect.selectByVisibleText(string);
	}
	
	public void enterMobileNum(String string) {
		mobilePhone.clear();
		mobilePhone.sendKeys(string);
	}
	
	public void enterAliasAddress(String string){
		aliasAddress.clear();
		aliasAddress.sendKeys(string);
	}
	
	public void clickSubmitAccount() {
		submitAccount.click();
		
	}
	
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/ol/li[1]")
	WebElement CountryError;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/ol/li")
	WebElement PostCodeError;
	
	public String countryErrorMessage(){
		String actualText = CountryError.getText();
		return actualText;
	}
	
	public String postCodeErrorMessage(){
		String actualText = PostCodeError.getText();
		return actualText;
	}
}
