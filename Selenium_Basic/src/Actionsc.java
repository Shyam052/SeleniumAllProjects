

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actionsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\Learning\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		Actions a=new Actions(driver);
		//a.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']"))).build().perform();
		//a.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']"))).contextClick().build().perform();
		//a.moveToElement(driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		String Control=Keys.chord(Keys.CONTROL,Keys.ENTER);


			
	
	}

}
