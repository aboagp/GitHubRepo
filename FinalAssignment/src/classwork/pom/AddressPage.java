package classwork.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage {
	
	public WebDriver driver;
	public AddressPage(WebDriver d) {
		driver = d;
	}
	@FindBy(xpath="//*[@id=\"center_column\"]/form/div/div[1]/div[1]/p/label")
	WebElement delAddress;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")
	WebElement proceedToChk;
	
	public void testCase_05(){
		delAddress.isDisplayed();
		delAddress.click();
		proceedToChk.click();
		
	}

}
