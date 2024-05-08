package packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paymentFunctionality {

	WebDriver driver;
	
	

	public paymentFunctionality(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='nav-cart-icon nav-sprite']") //click
	private WebElement aToCart;
	
	@FindBy(xpath = "span[@style='height: 2.6em;']") //click
	private WebElement item;
	
	@FindBy(xpath = "//input[@name='submit.buy-now']") //click
	private WebElement buy;
	
	@FindBy(xpath = "//input[@placeholder='Enter Code']")// will use sendkeys()
	private WebElement giftcode;
	
	@FindBy(xpath = "//input[@value='Apply']") //click
	private WebElement applycode;
	
	@FindBy(xpath = "//input[@value='SelectableAddCreditCard']") //click
	private WebElement creditRadioBtn;
	
	@FindBy(xpath = "//img[@Class='apx-add-pm-trigger-common-image']") //click()
	private WebElement plusIcon;
	
	@FindBy(xpath = "//input[@name='addCreditCardNumber']") //sendkeys()
	private WebElement cardNum;
	
	//driver.switchTo().frame("a-icon a-icon-dropdown");
	@FindBy(className = "a-button-text a-declarative")
//	@FindBy(xpath = "(//span[@class='a-button-text a-declarative'])[2]")
	private WebElement date;
	
	
	@FindBy(xpath = "//span[@id='pp-wsRO40-23']//span[@role='button']")
	private WebElement year;
	

	
	
}

