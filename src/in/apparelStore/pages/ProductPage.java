package in.apparelStore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	Actions actions;
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		actions = new Actions(driver);
	}
	
	@FindBy(linkText = "Printed Summer Dress")
	WebElement productLink;
	
	public void clickProductLink() {
		productLink.click();
	}
	
	@FindBy(css = "#center_column > div > div > div.pb-center-column.col-xs-12.col-sm-4 > p.socialsharing_product.list-inline.no-print > button.btn.btn-default.btn-google-plus")
	WebElement googleBtn;
	
	public void shareonGoogle() {
		googleBtn.click();
	}
	
	@FindBy(css = "#center_column > div > div > div.pb-center-column.col-xs-12.col-sm-4 > p.socialsharing_product.list-inline.no-print > button.btn.btn-default.btn-facebook")
	WebElement facebookBtn;
	
	public void shareonFacebook() {
		facebookBtn.click();
	}
	
	@FindBy(css = "button.btn:nth-child(4)")
	WebElement pinterestBtn;
	
	public void shareonPinterest() {
		pinterestBtn.click();
	}
	
	@FindBy(linkText = "Write a review")
	WebElement writeReviewLink;
	
	public void clickOnWriteReview() {
		writeReviewLink.click();
	}
	
	@FindBy(css = "div.star:nth-child(7) > a:nth-child(1)")
	WebElement selectProductStar;
	
	public void clickOnStarBtn() {
		selectProductStar.click();
	}
	
	@FindBy(id = "comment_title")
	WebElement commentTitle;
	
	public void enterCommentTitle(String string) {
		commentTitle.clear();
		commentTitle.sendKeys(string);
	}
	
	@FindBy(id = "content")
	WebElement content;
	
	public void enterContent(String string) {
		content.clear();
		content.sendKeys(string);
	}
	
	@FindBy(id = "submitNewMessage")
	WebElement submitReview;
	
	public void clickSubmitReview() {
		submitReview.click();
	}
	
	@FindBy(css = "button.exclusive")
	WebElement addToCartBtn;
	
	public void addToCart() {
		addToCartBtn.click();
	}
	
	
	
}
