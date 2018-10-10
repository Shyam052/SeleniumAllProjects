package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;






public class day1 {
	@Test(groups={"Smoke"})
	public void Demo()
	{
		System.out.println("day1");
	}

	@Parameters({"URL"})
	@Test
	public void day2(String URLName)
	{
	System.setProperty("webdriver.chrome.driver", "G:\\Learning\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(URLName);
	driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Test");
	driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(Keys.ENTER);
	System.out.println("Day2 in 1stclass");
	}

}
