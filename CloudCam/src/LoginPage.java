import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\Learning\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev.camworkscloud.com/Account/Login?ReturnUrl=%2FDocuments");
		System.out.println(driver.findElement(By.tagName("a")).getSize());
		driver.findElement(By.cssSelector("#Email")).sendKeys("shyam.ranganathan@hcl.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("Rapunzel@1994");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
}

}
