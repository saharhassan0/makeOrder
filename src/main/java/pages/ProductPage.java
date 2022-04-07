package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase{

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id=\"option-value-184\"]")
	WebElement color;
	
	@FindBy(xpath="//*[@id=\"button-cart\"]")
	WebElement addToCartBtn;
	
	@FindBy(xpath="//*[@id=\"counterLabel\"]")
	WebElement cartIcon;
	
	@FindBy(xpath="//a[contains(text(), 'Checkout')]")
	WebElement checkOutBtn;

	public void addProduct() {
		ClickButton(color);
		ClickButton(addToCartBtn);
		ClickButton(cartIcon);
		ClickButton(checkOutBtn);

}}

