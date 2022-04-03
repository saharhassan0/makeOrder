package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends PageBase{
	public CheckOutPage(WebDriver driver) {
		super(driver);
	}

	Action action = new Action(driver);
	
	@FindBy(xpath="//*[@id=\"phone-number\"]")
	WebElement phoneNumber;
	
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement firstName;
	
	@FindBy(xpath="//*[@id=\"zone-id\"]")
	WebElement state;
	
	@FindBy(xpath="//*[@id=\"street-details\"]")
	WebElement streetDetails;
	
	@FindBy(xpath="//*[@id=\"buildingdetails\"]")
	WebElement buildingDetails;
	
	@FindBy(xpath="//button/span[contains(text(), 'Continue to shipping')]")
	WebElement shippingBtn;

	public void enterPhone(String number) {
		action.type(phoneNumber, number);
		}
		
		public void enterName(String name) {
			action.type(firstName, name);			
	}
		
		public void clickOnState() {
			action.click(driver, state);
		}
		public void selectState() {
//			new Select(state).selectByIndex(1);
			action.selectByIndex(state, 2);
		}
		
		public void enterStreetDetails(String street) {
			action.type(streetDetails, street);			
	}
		public void enterBuildingDetails(String building) {
			action.type(buildingDetails, building);			
	}
		public ShippingPage continueToShipping() {
			action.click(driver, shippingBtn);
			return new ShippingPage(driver);
		}

}
