import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderUIDateSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ChromeOptions ops = new ChromeOptions();
		  ops.addArguments("disable-infobars");
          ops.addArguments("--disable-notifications");
          System.setProperty("webdriver.chrome.driver", "G:\\Learning\\Drivers\\chromedriver.exe");
          WebDriver driver = new ChromeDriver(ops);
          driver.get("https://paytm.com/bus-tickets");
          driver.manage().window().maximize();
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div[5]/div/div/div/div/div/input")).click();
		//MonthSelection
		
		while(!driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText().equalsIgnoreCase("August 2018"))
		{
		driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/a")).click();
			
		}
		
	
		//Date Selection
		int DateCount=driver.findElements(By.cssSelector("div[class*='react-datepicker__day react-datepicker']")).size();
		for(int i=0;i<=DateCount;i++)
		{
			String text=driver.findElements(By.cssSelector("div[class*='react-datepicker__day react-datepicker']")).get(i).getText();
			if(text.equalsIgnoreCase("25"))
			{
				driver.findElements(By.cssSelector("div[class*='react-datepicker__day react-datepicker']")).get(i).click();
				break;
			}
		}
	}

}
