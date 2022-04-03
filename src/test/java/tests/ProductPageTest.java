package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPageTest extends TestBase{
	
	private pages.IndexPage index;
	private pages.SearchResultPage searchResultPage;
	private pages.ProductPage productPage;
	
	
	
	@Test
	public void productPageTest(String productName, String color) throws Throwable {
		index= new pages.IndexPage(null);
		searchResultPage=index.searchProduct(productName);
		productPage=searchResultPage.clickOnProduct();
		productPage.selectColor(color);
		productPage.clickOnAddToCart();
		
	}
}
