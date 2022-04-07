package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.IndexPage;
import pages.SearchResultPage;

public class SeachResultTest extends TestBase{
	IndexPage index;
	SearchResultPage searchResultPage;
	

	@Test
	public void SearchResultPage(){
		index = new IndexPage(driver);
		index.SearchResultPage("iphone");
		
	}

}
