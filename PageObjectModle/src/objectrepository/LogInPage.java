package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	WebDriver driver;
	
	public LogInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	

	By username=By.xpath("//*[@id='Email']");
	By password=By.xpath("//*[@id='Password']");
	By loginbutton=By.xpath("//*[@value='Log in']");
	
	
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement loginbutton()
	{
		return driver.findElement(loginbutton);
	}


}
