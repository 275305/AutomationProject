import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class FaceBookTest {
	
	
	@Test
	public void getLogin() {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_8')]")).sendKeys("Shree");
		driver.findElement(By.xpath("//input[contains(@id,'u_0_a')]")).sendKeys("Ram");
		
		Select select=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		
		select.selectByValue("1");
		
		
		
		
		  Select select1=new Select(driver.findElement(By.xpath("//select[@id='year']")));
		  
		  
		  select1.selectByVisibleText("2002");
		 
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'u_0_h')]")).sendKeys("8919384728");
		
		
	}

}
