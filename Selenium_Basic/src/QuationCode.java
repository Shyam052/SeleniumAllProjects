import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuationCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Learning\\Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(driver.findElementByCssSelector("input#displayed-text").isDisplayed());
		driver.findElementByXPath("//input[@id='hide-textbox']").click();
		System.out.println(driver.findElementByCssSelector("input#displayed-text").isDisplayed());
		
		
		
		
	}

}
