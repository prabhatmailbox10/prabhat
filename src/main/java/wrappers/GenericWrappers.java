package wrappers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

import wrapperinterface.GenericInterface;

public class GenericWrappers extends WDEvent implements GenericInterface{
	
	public static RemoteWebDriver driver;
	public static String url = "http://leaftaps.com/opentaps";
	public static EventFiringWebDriver eventDriver;
		
	public WebElement locateElement(String how, String using){
		WebElement ele =null;
		switch(how){
			
			case("id"):
				ele = eventDriver.findElement(By.id(using));
				break;
			case("name"):
				ele = eventDriver.findElement(By.name(using));
				break;
			case("className"):
				ele = eventDriver.findElement(By.className(using));
				break;
			case("tagName"):
				ele = eventDriver.findElement(By.tagName(using));
				break;
			case("cssSelector"):
				ele = eventDriver.findElement(By.cssSelector(using));
				break;
			case("linkText"):
				ele = eventDriver.findElement(By.linkText(using));
				break;
			case("xpath"):
				ele = eventDriver.findElement(By.xpath(using));
				break;
			case("type"):
				ele = eventDriver.findElement(By.xpath("//*[@type='"+using+"']"));
				break;
			case("value"):
				ele = eventDriver.findElement(By.xpath("//*[@value='"+using+"']"));
				break;
			case("href"):
				ele = eventDriver.findElement(By.xpath("//*[@href='"+using+"']"));
				break;
			case("ng-reflect-name"):
				ele = eventDriver.findElement(By.xpath("//*[@ng-reflect-name='"+using+"']"));
				break;
			default:
				System.out.println("The given locator "+how+ "is not correct");
				break;
		}
				
		return ele;
		
	}
	
	public void clearTextField(WebElement ele){
		ele.clear();
	}
	
	
	public void enterValue(WebElement ele, String text){
		ele.sendKeys(text);
	}
	
	public void clickByLocator(WebElement ele){
		
		ele.click();
	}
	
	public void selectByVisibleText(WebElement ele, String value){
		
		Select dropdown = new Select(ele);
		dropdown.selectByVisibleText(value);
	}
	
	public void selectByValue(WebElement ele, String value){
			
		Select dropdown = new Select(ele);
		dropdown.selectByValue(value);
	}
	
	public void selectByIndex(WebElement ele, int indexNum){
		
		Select dropdown = new Select(ele);
		dropdown.selectByIndex(indexNum);
	}
	
	public void switchWindow(int index){
		//HashSet - Random Order
		//TreeSet - ASCII Order
		//LinkedHashSet - Order of insertion
		
		Set<String> allWindowHandles = eventDriver.getWindowHandles();
		List<String> allWindows = new ArrayList<>();
		allWindows.addAll(allWindowHandles);
		eventDriver.switchTo().window(allWindows.get(index));
		
	}
	
	public void alertAccept(){
		
		eventDriver.switchTo().alert().accept();
	}
	
	public void alertDismiss(){
		
		eventDriver.switchTo().alert().dismiss();
	}
	
	public String alertGetText(){
		
		String alertMsg = eventDriver.switchTo().alert().getText();
		return alertMsg;
				
	}
	
	public void switchToFrame(WebElement ele){
		
		eventDriver.switchTo().frame(ele);
	}
	
	public boolean VerifyTitle(WebElement ele, String value){
		
		boolean title = false;
		
		return title;
	}
	
	public String getAttribute(WebElement ele, String value){
		
		String attributeValue = ele.getAttribute(value);
		
		return attributeValue;
	}
	
	public String getText(WebElement ele){
		
		String text = ele.getText();
		
		return text;
	}
	
	public boolean verifyText(WebElement ele, String value){
		
		boolean bReturn = false;
		if(ele.getText().equals(value)){
			bReturn = true;
		}
		return bReturn;
	}
	
	public void invokeApp(String browser, String url){
		
		switch(browser){
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			eventDriver = new EventFiringWebDriver(driver);
			WDEvent handler = new WDEvent();
			eventDriver.register(handler);
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
			eventDriver = new EventFiringWebDriver(driver);
			handler = new WDEvent();
			eventDriver.register(handler);
			break;
		}
		
		eventDriver.get(url);
		eventDriver.manage().window().maximize();
		eventDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	public void closeBrowser(){
		
		driver.quit();
	}
	
	
	
}
