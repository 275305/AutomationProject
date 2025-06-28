import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {
	
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://www.makemytrip.com/");
		
		 driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		 driver.findElement(By.xpath("//a[text()='Search']")).click();
		 
		 
	}

}
