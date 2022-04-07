package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.CheckOutPage;
import pages.IndexPage;
import pages.OrderSucessPage;
import pages.PaymentPage;
import pages.ProductPage;
import pages.SearchResultPage;
import pages.ShippingPage;

public class CheckOutPageTest extends TestBase{
	
	IndexPage index;
	SearchResultPage searchResultPage;
	ProductPage productPage;
	CheckOutPage checkoutPage;
	ShippingPage shippingPage;
	PaymentPage paymentPage;
	OrderSucessPage orderSuccessPage;
	
	
	
	@DataProvider(name = "testData")
	public static Object[][] CheckOutData() {
	    return new Object[][]
	            {
	                    {"01005582222", "sahar" , "sahar.hassan@expandcart.com", "63" , "1008" , "st test" , "1234"}};
	            }	            
	            
//priority run first
	@Test(dataProvider = "testData")
	public void shippinPage(String number, String name , String Email, String Country, String State, String street, String building) throws Exception { 
		index = new IndexPage(driver);
		index.SearchResultPage("iphone");
		Thread.sleep(5000);
		searchResultPage = new SearchResultPage(driver);
		searchResultPage.ProductPage();
		Thread.sleep(8000);
		productPage = new ProductPage(driver);
		productPage.addProduct();
		checkoutPage = new CheckOutPage(driver);
		checkoutPage.goToshippinPage(number, name, Email, Country, State, street, building);
		Thread.sleep(3000);		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(3000);		
		checkoutPage.clickOnGoToShippingBtn();
		 Thread.sleep(8000);		
		shippingPage = new ShippingPage(driver);
		shippingPage.selectPayment();
		Thread.sleep(5000);
		shippingPage.goToPaymentPage();
		paymentPage = new PaymentPage(driver);
		paymentPage.selectCashOnDelivery();
		Thread.sleep(5000);
		paymentPage.goToOrderSucessPage();
		orderSuccessPage = new OrderSucessPage(driver);
		Thread.sleep(5000);
		orderSuccessPage.validateSucessMsg();
	}}






	


