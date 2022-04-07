package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage extends PageBase{
	
	public ShippingPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"shipping\"]//label/input")
	WebElement flatShipping;
	
	@FindBy(xpath="*//div[3]/div/div/div/div[1]/div/button")
	WebElement paymentBtn;
	
	public void selectPayment() {
		ClickButton(flatShipping);

	}
	
	public void goToPaymentPage() {
		ClickButton(paymentBtn);
	}
	
}
