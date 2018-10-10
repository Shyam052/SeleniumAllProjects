import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Iterators;

public class InterviewQuations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Learning\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());//Gives Count of links on complete website.
		WebElement ele=driver.findElement(By.xpath("//*[@id='gf-BIG']"));
		
		WebElement DisOp=driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		int Size=DisOp.findElements(By.tagName("a")).size();//Gives Count of DiscoutSection.
		for(int i=1;i<Size;i++)
		{
			String ComClick=Keys.chord(Keys.CONTROL,Keys.ENTER);
			DisOp.findElements(By.tagName("a")).get(i).sendKeys(ComClick);
			
		}
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		driver.switchTo().window(it.next());
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}



}
