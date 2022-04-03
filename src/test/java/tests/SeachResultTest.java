package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.IndexPage;
import pages.SearchResultPage;

public class SeachResultTest extends TestBase{
	IndexPage index;
	SearchResultPage searchResultPage;
	

	
	@Test
	public void SearchResultPage(String iphone){
		index = new IndexPage(driver);
		pages.SearchResultPage searchProduct = index.searchProduct(iphone);
//		boolean result=searchResultPage.isProductAvailable();
//		Assert.assertTrue(result);
		
	}

}
