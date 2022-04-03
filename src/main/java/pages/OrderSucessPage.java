package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSucessPage extends PageBase {
	
	Action action = new Action(driver);

	public OrderSucessPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//h1[contains(text(),'Your Order Has Been Processed!')]")
	WebElement successMsg;
	
	public String validateSucessMsg() {
		action.isDisplayed(driver, successMsg);
		return null;
	}
}
