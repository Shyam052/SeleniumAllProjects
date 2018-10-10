package testcasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectreprository.CloudLogInPage;
import objectreprository.HomePage;

public class LogInTestCases {

@Test
public void LogIn()
{
	System.setProperty("webdriver.chrome.driver", "G:\\Learning\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://dev.camworkscloud.com/Account/Login?ReturnUrl=%2FDashboard");
	driver.manage().window().maximize();
	CloudLogInPage LogIn=new CloudLogInPage(driver);
	LogIn.userName().sendKeys("shyam.ranganathan@hcl.com");
	LogIn.PassWord().sendKeys("Rapunzel@1994");
	LogIn.LogIn().click();
	HomePage hp=new HomePage(driver);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	boolean value=hp.partlink().isDisplayed();
	if(value==true)
	{
		hp.delete().click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.switchTo().notify();
		hp.deleteYes().click();
	}
	
	hp.uploadfile().sendKeys("C:\\Users\\Shyam\\Downloads\\assignment_2.sldprt");
	
	
}

	
}
