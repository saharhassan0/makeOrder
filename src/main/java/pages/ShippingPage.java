package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage extends PageBase{
	
	Action action = new Action(driver);

	public ShippingPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"shipping\"]//label/input")
	WebElement flatShipping;
	
	@FindBy(xpath="//button/span[text()='Continue to payment']")
	WebElement paymentBtn;
	
	public void clickOnflatShipping() {
		action.click(driver, flatShipping);
	}
	
	public PaymentPage clickOnPaymentBtn() {
		action.click(driver, paymentBtn);
		return new PaymentPage(driver);
	}

}
