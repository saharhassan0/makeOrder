package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends PageBase{

	private static WebDriver driver;



	public IndexPage(WebDriver driver) 
	{
		super(driver);
	}
		
	@FindBy(xpath="//input[@name='search']")
	WebElement SearchBox;
	

	@FindBy(xpath="//*[@id=\"search\"]/div/button")
	WebElement SearchBtn;
	
	
	
	 public void SearchResultPage(String productName) {
	        SendText(SearchBox, productName);
	        ClickButton(SearchBtn);
	    }
	}




