package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase{
	Action action = new Action(driver);

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="#option-value-184")
	WebElement color;
	
	@FindBy(xpath="//*[@id=\"button-cart\"]")
	WebElement addToCartBtn;
	
	@FindBy(xpath="//*[@id=\"counterLabel\"]")
	WebElement cartIcon;
	
	@FindBy(xpath="//a[contains(text(), 'Checkout')]")
	WebElement checkOutBtn;

	public void selectColor(String color2) {
		action.click(driver, color);
	}
	
	public void clickOnAddToCart() {
		action.click(driver, addToCartBtn);
	}
		
	public void clickOnCartIcon() {
		action.click(driver, cartIcon);
	}
	
	public CheckOutPage clickOnCheckout() {
		action.click(driver, checkOutBtn);
		return new CheckOutPage(driver);
	}

}

