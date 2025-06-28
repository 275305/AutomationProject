import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamplePage {

	
	final WebDriver driver;
	  
	  
	  public SamplePage(WebDriver driver) { 
		  this.driver=driver; 
	  PageFactory.initElements(driver,this);
	  }
	 

	@FindBy(xpath = "//input[@id='email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='pass']")
	WebElement password;

	@FindBy(xpath = "//button[@name='login']")
	WebElement logIn;

	public void getEmail() {

		email.sendKeys("pradeep123@gmail.com");

	}

	public void getPassword() {

		password.sendKeys("Pradeep123");
	}

	public void getLogIn() {

		logIn.click();

	}

}
