package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends PageBase{

	public IndexPage(WebDriver driver) {
		super(driver);
	}
	
	Action action = new Action(driver);
	
	@FindBy(xpath="//input[@name='search']")
	WebElement SearchBox;
	

	@FindBy(xpath="//*[@id=\"search\"]/div/button")
	WebElement SearchBtn;
	
	
	
	public SearchResultPage searchProduct(String productName) {
		action.type(SearchBox, productName);
		action.click(driver, SearchBtn);
		return new SearchResultPage(driver);
	}}




