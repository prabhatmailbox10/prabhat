package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestCase3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		
		driver.findElement(By.name("phoneCountryCode")).clear();
		//driver.findElement(By.name("phoneNumber")).clear();
		driver.findElement(By.name("phoneNumber")).sendKeys("9790888529");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String firstLead = driver.findElement(By.xpath("(//a[@class = 'linktext'])[4]")).getText();
		System.out.println("First Lead in search :: " +firstLead);
		driver.findElement(By.xpath("(//a[@class = 'linktext'])[4]")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(firstLead);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String errorMsg = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println("Error Message :: "+errorMsg);
		driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		
		
		
		

	}

}
