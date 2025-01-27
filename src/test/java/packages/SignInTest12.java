package packages;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SignInTest12 {
   
    private WebDriver driver;
    private SignInPage signin;
    SearchFunction1 search1;
    AddToCart addtoCart;
    paymentFunctionality pf;
    
	@BeforeMethod
	public void setUp() throws IOException {
		
		Properties pObj = new Properties();
	    FileInputStream fis = new FileInputStream("C:\\Users\\Manisha\\Documents\\workspace-spring-tool-suite-4-4.21.1.RELEASE\\POMAmazonProject\\src\\test\\resources\\project.properties");
	    pObj.load(fis);
	    
	    //setup the browser
		WebDriverManager.chromedriver()	.setup();
		
	    driver = new ChromeDriver();
	    
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(pObj.getProperty("AmazonBaseURL"));
		
	    signin = new SignInPage(driver);
	    search1 = new SearchFunction1(driver);
	    addtoCart = new AddToCart(driver);
	    pf = new paymentFunctionality(driver);
	}
	@Test(priority = 0)
	public void testSignIn() throws InterruptedException {
		signin.clickSignIn();
		Thread.sleep(2000);
	    signin.signInMobile("9382392290");
	    Thread.sleep(2000);
	    signin.continueButton();
	    Thread.sleep(2000);
	    signin.passwordFeild("amazon1234");
	    Thread.sleep(2000);
	    signin.submitButton();
	    Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void testSearch() throws InterruptedException {
		search1.searchArea("mobiles");
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void testAddToCart() throws InterruptedException {
		addtoCart.addNow("iphone15pro");
		Thread.sleep(2000);
	}
	@Test(priority = 3)
	public void paymentTest() throws InterruptedException {
		pf.giftcodeMethod("8778");
		pf.cardNumberMethod("8778 7878 5454");
		Thread.sleep(2000);
	}
	
	@AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
