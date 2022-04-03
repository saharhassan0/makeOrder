package tests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.IndexPage;
import pages.OrderSucessPage;
import pages.PaymentPage;
import pages.ProductPage;
import pages.SearchResultPage;
import pages.ShippingPage;


public class EndToEndTest extends TestBase {

	private IndexPage index;
	private SearchResultPage searchResultPage;
	private ProductPage productPage;
	private CheckOutPage checkOutPage;
	private ShippingPage shippingPage;
	private PaymentPage paymentPage;
	private OrderSucessPage orderSuccessPage;
	
	

	@Test
	public void endToEndTest(String productName, String color)throws Throwable {
		index= new IndexPage(null);
		searchResultPage=index.searchProduct(productName);
		productPage=searchResultPage.clickOnProduct();
		productPage.selectColor(color);
		productPage.clickOnAddToCart();
		productPage.clickOnCartIcon();
		productPage.clickOnCheckout();
		String number = null,name = null,street = null,building = null;
		checkOutPage.enterPhone(number);
		checkOutPage.enterName(name);
		checkOutPage.selectState();
		checkOutPage.enterStreetDetails(street);
		checkOutPage.enterBuildingDetails(building);
		shippingPage=checkOutPage.continueToShipping();
		shippingPage.clickOnflatShipping();
		paymentPage=shippingPage.clickOnPaymentBtn();
		paymentPage.selectCashOnDelivery();
		orderSuccessPage=paymentPage.completeOrder();
		String actualMessage=orderSuccessPage.validateSucessMsg();
		String successMsg="Your Order Has Been Processed!";
		}
}
