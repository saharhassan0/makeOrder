package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSucessPage extends PageBase {
	
	public OrderSucessPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//h1[contains(text(),'Your Order Has Been Processed!')]")
	WebElement successMsg;
	
	public void validateSucessMsg() {
		Dispaly(driver, successMsg);
	}
}
