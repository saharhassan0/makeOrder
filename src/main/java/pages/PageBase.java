package pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public class PageBase {
		
		protected WebDriver driver;
		
		//Create Constructor
		public PageBase(WebDriver driver)
		{
			
			PageFactory.initElements(driver, this);
	}

}
