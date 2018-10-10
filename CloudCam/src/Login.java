import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Login {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		ch.setBrowserName(CapabilityType.ACCEPT_SSL_CERTS);
		ChromeOptions Css =new ChromeOptions();
		 
		
		System.setProperty("webdriver.chrome.driver","G:\\Learning\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(Css);
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("facebook");
		driver.manage().window().maximize();
		driver.get("https://dev.camworkscloud.com/Account/Login?ReturnUrl=%2FDocuments");
		driver.findElement(By.className("form-control")).sendKeys("shyam.ranganathan@hcl.com");
		driver.findElement(By.name("Password")).sendKeys("Rapunzel@1994");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();

	
		

	}

}
