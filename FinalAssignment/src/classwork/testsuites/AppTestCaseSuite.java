package classwork.testsuites;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import classwork.pom.AddToCartPage;
import classwork.pom.AddressPage;
import classwork.pom.HomePage;
import classwork.pom.LoginPage;
import classwork.pom.ShippingCartSummaryPage;


public class AppTestCaseSuite {
	
	public WebDriver driver;
	public String url="http://automationpractice.com";
	public String bType = "Chrome";
	public ShippingCartSummaryPage shippingObj;
	public HomePage homeObj;
	public AddToCartPage addToCartObj;	
	public LoginPage loginObj; 	
	public AddressPage addresObj;
	
	@BeforeClass
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTraining\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTraining\\Drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		if(bType.equalsIgnoreCase("Firefox") || bType.equalsIgnoreCase("ff")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
		driver.manage().window().maximize();
		System.out.println("Launched browser succcessfully");
		homeObj = PageFactory.initElements(driver, HomePage.class);
		
		addToCartObj = PageFactory.initElements(driver, AddToCartPage.class);
		
		shippingObj = PageFactory.initElements(driver, ShippingCartSummaryPage.class);
		
		loginObj = PageFactory.initElements(driver, LoginPage.class);
		
		addresObj = PageFactory.initElements(driver, AddressPage.class);
		
	}
	
	@Test(priority=1)
	public boolean validateElements() throws Exception {
		homeObj.testCase_01();
		System.out.println("in validation test");
		
		return true;
	}
	
	@Test(priority=3)
	public void popularAddToCart() throws Exception {
		addToCartObj.testCase_02();
		System.out.println("in popular test");
		
		
	}
	@Test(priority=5)
	public void summary() throws Exception {
		shippingObj.testCase_03();
		System.out.println("in summary test");
		
	
	}
	@Test(priority=7)
	public void accountSignIn() throws Exception {
		loginObj.testCase_04();
		System.out.println("in account sign in test");
		
	
	}
	
	@Test(priority=9)
	public void address() throws Exception {
		addresObj.testCase_05();
		System.out.println("in address sign in test");
		
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();

   }

}
