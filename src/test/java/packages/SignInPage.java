package packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	    @FindBy(xpath= "//span[@id='nav-link-accountList-nav-line-1']")
	    private WebElement hellosignin;
	    
	    @FindBy(xpath = "//input[@tabindex='1']")
	    private WebElement mobileFeild;
	    
	    @FindBy(xpath = "//input[@tabindex='5']")
	    private WebElement continueBtn;
	    
	    @FindBy(xpath = "//input[@tabindex='2']")
	    private WebElement password;
	    
	    @FindBy(xpath = "//input[@tabindex='3']")
	    private WebElement submitbtn;
	    
	    public void clickSignIn() {
	    	this.hellosignin.click();
	    }
	    
	    public void signInMobile(String mobile){
	    	this.mobileFeild.sendKeys(mobile);
	    }
	    
	    public void continueButton() {
	    	this.continueBtn.click();
	    }
	    
	    public void passwordFeild(String pass) {
	    	this.password.sendKeys(pass);
	    }
	    
	    public void submitButton() {
	    	this.submitbtn.click();
	    }
}

