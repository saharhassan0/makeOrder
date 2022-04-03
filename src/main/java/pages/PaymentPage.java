package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends PageBase {
	
	Action action = new Action(driver);

	public PaymentPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id=\"cod\"]")
	WebElement cashOnDelivery;
	
	@FindBy(xpath="//button/span[text()='Complete order']")
	WebElement completeOrderBtn;
	
	public void selectCashOnDelivery() {
		action.click(driver, cashOnDelivery);
	}
	
	public OrderSucessPage completeOrder() {
		action.click(driver, completeOrderBtn);
		return new OrderSucessPage(driver);
	}
}
