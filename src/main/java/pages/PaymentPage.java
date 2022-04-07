package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends PageBase {
	
	public PaymentPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id=\"cod\"]")
	WebElement cashOnDelivery;
	
	@FindBy(xpath="/*//div[3]/div/div/div/div[1]/div/button")
	WebElement completeOrderBtn;
	
	public void selectCashOnDelivery() {
		ClickButton(cashOnDelivery);
	}
	
	public void goToOrderSucessPage () {
		ClickButton(completeOrderBtn);
	}
}
