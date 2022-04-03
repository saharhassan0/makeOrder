package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends PageBase {
	
	Action action = new Action(driver);

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id=\"secCategory\"]//img")
	WebElement productResult;
	
	public boolean isProductAvailable() {
		return action.isDisplayed(driver, productResult);
	}
	
	public ProductPage clickOnProduct() {
		action.click(driver, productResult); 
		return new ProductPage(driver);
	}
}
