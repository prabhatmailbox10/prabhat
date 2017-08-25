package wrappers;


import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WDEvent implements WebDriverEventListener{

	@Override
	public void afterAlertAccept(WebDriver arg0) {
		
		System.out.println("After alert accept ::");
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		System.out.println(" After alert dismiss");
		
	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		
		System.out.println("after change field value even clear textfield/dropdown value change:::"+arg0);
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		
		System.out.println("after clicking on WebElement:::"+arg0);
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		
		System.out.println("After find element ::::"+arg1);
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		
		System.out.println("After navigate back to web page:::");
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		
		System.out.println("After navigate forward to web page:::");
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		
		System.out.println("After reload the current page:::");
		
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		
		System.out.println("After navigate to new url:::"+arg0);
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		
		System.out.println("");
	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		
		System.out.println("Before accepting alert:::");
	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		
		System.out.println("Before cancelling alert:::");
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		
		System.out.println("Before change value of "+arg0);
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		
		System.out.println("Before click on "+arg0);
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		
		
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		
		
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		
		System.out.println("Before navigate to element:::"+arg1);
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		
		
	}

	@Override
	public void onException(Throwable throable, WebDriver driver) {
		
		if(throable instanceof InvalidSelectorException){
			System.out.println("The InvalidSelectorException ::::"+throable.getMessage());
		}else if(throable instanceof NoSuchElementException){
			System.out.println("The WebDriver.findElement/WebElement.findElement couldn't able to find::"+throable.getMessage().split("The Element:", 0));
		}else if(throable instanceof NotFoundException){
			System.out.println("The NotFoundException ::"+throable.getMessage());
		}else if(throable instanceof WebDriverException){
			System.out.println("The WebDriverException ::"+throable.getMessage());
		}else if(throable instanceof NoSuchWindowException){
			System.out.println("The window could not be found::"+throable.getMessage());
		}else if(throable instanceof StaleElementReferenceException){
			System.out.println("stale --- the element no longer appears on the DOM of the page :: "+throable.getMessage());
		}else if(throable instanceof NoSuchFrameException){
			System.out.println("Desired frame not found::"+throable.getMessage());
		}else if(throable instanceof NoAlertPresentException){
			System.out.println("Trying to handle alert but it is not actually present ::"+throable.getMessage());
		}else if(throable instanceof InvalidElementStateException){
			System.out.println("WebElement is in a state that means actions cannot be performed with it::"+throable.getMessage());
		}else if(throable instanceof ElementNotVisibleException){
			System.out.println("The element is present on the DOM, it is not visible, and so is not able to be interacted with ::"+throable.getMessage());
		}else if(throable instanceof ElementNotSelectableException){
			System.out.println("The element is present on the DOM, it is not selectable, and so is not able to be interacted with ::"+throable.getMessage());
		}else if(throable instanceof ElementNotInteractableException){
			System.out.println("The element is present on the DOM, it is not in a state that can be interacted with ::"+throable.getMessage());
		}
	}

}
