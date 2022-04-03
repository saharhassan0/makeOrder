package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.CheckOutPage;
import pages.ProductPage;

public class CheckOutPageTest extends TestBase{
	
	private pages.IndexPage index;
	private pages.SearchResultPage searchResultPage;
	private ProductPage productPage;
	CheckOutPage object;
	
	
	@DataProvider(name = "testData")
	public static Object[][] CheckOutData() {
	    return new Object[][]
	            {
	                    {"01005582222", "sahar" , 2 , "test" ,   "1234"}};
	            }	            
	            
//priority run first
	@Test(dataProvider = "testData")
	public void CheckOut(String number, String name , Select state, String street, String building) throws InterruptedException {
	    object = new CheckOutPage(driver);
	    object.enterPhone(number);  
	    object.enterName(name);
	    object.selectState();
	    object.enterStreetDetails(street);
	    object.enterStreetDetails(street);
	  
	    Thread.sleep(80000);
	}}
	


