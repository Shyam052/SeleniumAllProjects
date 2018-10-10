import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitwAIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Learning\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.alaskaair.com/");
		driver.findElement(By.cssSelector("#tab-hotels")).click();
		driver.findElement(By.cssSelector("#hotelOnlyToLocation")).sendKeys("Nyc");
		driver.findElement(By.cssSelector("#hotelOnlyToLocation")).sendKeys(Keys.ENTER);
		
	}

}
