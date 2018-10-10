import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Learning\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions a=new Actions(driver);
		WebElement Source=driver.findElement(By.id("draggable"));
		WebElement Target=driver.findElement(By.id("droppable"));
		a.dragAndDrop(Source,Target).build().perform();
		WebDriverWait d=new WebDriverWait(driver, 5);
		//d.until(ExpectedConditions.visibilityOfElementLocated(locator))
	
	}

}
