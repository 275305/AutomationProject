import java.io.File;
import java.time.Duration;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleLogin {
		
	 WebDriver driver ;
	 SamplePage simple;
	@BeforeMethod	
	public void initialiseDriver() {
		
				
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
	}
	@Test
	public void testLogin() {
		simple=new SamplePage(driver);
		
		//SamplePage simple=PageFactory.initElements(driver, SamplePage.class);
		simple.getEmail();
		simple.getPassword();
		simple.getLogIn();
		
	}

}
