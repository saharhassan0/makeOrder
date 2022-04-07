package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends PageBase{
	public CheckOutPage(WebDriver driver) 
	{
		super(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	}
	
	
	@FindBy(xpath="//*[@id=\"phone-number\"]")
	WebElement phoneNumber;
	
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement firstName;
	
	@FindBy(xpath="//*[@id=\"contact-email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"country-id\"]")
	WebElement country;
	
	@FindBy(xpath="//*[@id=\"zone-id\"]")
	WebElement state;
	
	@FindBy(xpath="//*[@id=\"street-details\"]")
	WebElement streetDetails;
	
	@FindBy(xpath="//*[@id=\"buildingdetails\"]")
	WebElement buildingDetails;
	
	@FindBy(xpath="*//div/div/div/div[1]/div/button")
	WebElement shippingBtn;


		
		public void goToshippinPage(String number, String name,String Email, String Country, String State, String street, String building ) {
			SendText(phoneNumber, number);
			SendText(firstName, name);	
			SendText(email, Email);	
			Select countryList = new Select(country);
			countryList.selectByValue(Country);
			Select stateList = new Select(state);
			stateList.selectByValue(State);		
			ClickButton(state);
			SendText(streetDetails, street);		
			SendText(buildingDetails, building);	
			

			

		}
		
		public void clickOnGoToShippingBtn() {
		       ClickButton(shippingBtn);

		}
}


