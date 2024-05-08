package packages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
   WebDriver driver;
   
   public AddToCart(WebDriver driver) {
	   
	   this.driver = driver;
	   
	   PageFactory.initElements(driver, this);
   }
	
      @FindBy(id = "twotabsearchtextbox")
      private WebElement searchbtn;
    
      @FindBy(id = "a-autoid-1-announce")
      private WebElement addbtn; 
   
      @FindBy(id = "nav-cart-count")
      private WebElement aToCart;
   
   public void addNow(String iphone) throws InterruptedException {
	   searchbtn.sendKeys("iphone15pro");
	   searchbtn.sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	   addbtn.click();
	   Thread.sleep(2000);
	   aToCart.click();
	   Thread.sleep(2000);
	   
   }
}
