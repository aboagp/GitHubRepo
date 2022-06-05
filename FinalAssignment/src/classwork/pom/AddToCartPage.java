package classwork.pom;

  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.WebElement;
  import org.openqa.selenium.support.FindBy;

  public class AddToCartPage {
	
  public WebDriver driver;
	
  public AddToCartPage(WebDriver d) {
		driver = d;
			
	}
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span")
	WebElement addingToCart;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	WebElement proceedToC;
    
    public void testCase_02(){
        addingToCart.isDisplayed();
        System.out.println("Proceed to chechout displayed");
    	addingToCart.click();
    	proceedToC.getText();
    	proceedToC.click();         
	
	
    }
}