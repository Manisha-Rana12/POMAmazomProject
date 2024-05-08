package packages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFunction1 {
     WebDriver driver;
     
     public SearchFunction1(WebDriver driver) {
    	 this.driver =driver;
    	 PageFactory.initElements(driver, this);
     }
	
     @FindBy(xpath = "//input[@placeholder='Search Amazon.in']")
 	 private WebElement searchfeild;
     
     public void searchArea(String product) throws InterruptedException {
    	 searchfeild.sendKeys(product);
    	 searchfeild.sendKeys(Keys.ENTER);
    	 Thread.sleep(2000);
     }
	
}
