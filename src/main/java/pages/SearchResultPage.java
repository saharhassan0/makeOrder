package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends PageBase {
	

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id=\"secCategory\"]//img")
	WebElement productResult;
	
	public void ProductPage() {
//		Dispaly(driver, productResult);
		ClickButton(productResult);
	}
	

}
