package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectrepository.Homepage;
import objectrepository.LogInPage;

public class LogInTestCasses {
@Test(priority=1)
public void cloudlogInPage() 
{
	System.setProperty("webdriver.chrome.driver", "G:\\Learning\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	LogInPage lp=new LogInPage(driver);
	driver.get("https://dev.camworkscloud.com/Account/Login?ReturnUrl=%2FDashboard");
	lp.username().sendKeys("shyam.ranganathan@hcl.com");
	lp.password().sendKeys("Rapunzel@1994");
	lp.loginbutton().click();
	Homepage hp=new Homepage(driver);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	/*while(hp.PartsDelete().isEnabled());
	{
		hp.PartsDelete().click();
	}*/
	hp.upload().sendKeys("C:\\Users\\Shyam\\Downloads\\assignment_2.sldprt");
	hp.File().click();
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.switchTo().activeElement();
	hp.machineDone().click();
	hp.Gcode().click();
	
}
}
