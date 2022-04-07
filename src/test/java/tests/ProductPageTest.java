package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.IndexPage;
import pages.ProductPage;
import pages.SearchResultPage;

public class ProductPageTest extends TestBase{
	
	IndexPage index;
	SearchResultPage searchResultPage;
	ProductPage productPage;
	
	
	
	@Test
	public void productPageTest() throws InterruptedException {
		index = new IndexPage(driver);
		index.SearchResultPage("iphone");
		Thread.sleep(5000);
		searchResultPage = new SearchResultPage(driver);
		searchResultPage.ProductPage();
		Thread.sleep(8000);
		productPage = new ProductPage(driver);
		productPage.addProduct();
		
	}
}
