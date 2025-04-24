package Day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Open_Browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Plabani\\eclipse-workspace\\OrangeHRM_SDETBATCH2\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//Upcasting
		driver.get("file:///C:/Users/Plabani/Documents/MY/prac.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/*driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("QSpiders");
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 5);

		
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click();
		Alert a=driver.switchTo().alert();
		wait.until(ExpectedConditions.alertIsPresent());

		System.out.println(a.getText());
		a.accept();
		
		wait.until(ExpectedConditions.titleContains("OrangeHRM"));
	List<WebElement> element	=driver.findElements(By.xpath("//span[contains(text(),'QSpiders')]"));
	Thread.sleep(5000);
	System.out.println(element.size());
	for(int i=0;i<element.size();i++)
	{
		Thread.sleep(5000);
 WebElement element1=element.get(i);
	Thread.sleep(5000);

	System.out.println(element1.getText());
		*/
	WebElement element2=	driver.findElement(By.id("slv"));
	Select sel=new Select(element2);
	sel.selectByIndex(3);
    sel.selectByIndex(2);
    Thread.sleep(3000);
    sel.deselectAll();
	}
	
	}


