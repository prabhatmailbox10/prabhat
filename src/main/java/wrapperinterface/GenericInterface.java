package wrapperinterface;

import org.openqa.selenium.WebElement;

/**
 * This interface is to tell the design of the wrappers
 * @author prabhatk
 */
public interface GenericInterface {
	
	/**
	 * @param how
	 * @param using
	 * @return
	 */
	public WebElement locateElement(String how, String using);
	
	/**
	 * @param ele
	 */
	public void clearTextField(WebElement ele);
	
	/**
	 * @param ele
	 * @param text
	 */
	public void enterValue(WebElement ele, String text);
	
	/**
	 * @param ele
	 */
	public void clickByLocator(WebElement ele);
	
	/**
	 * @param ele
	 * @param value
	 */
	public void selectByVisibleText(WebElement ele, String value);
	
	/**
	 * @param ele
	 * @param value
	 */
	public void selectByValue(WebElement ele, String value);
	
	/**
	 * @param ele
	 * @param indexNum
	 */
	public void selectByIndex(WebElement ele, int indexNum);
	
	/**
	 * @param index
	 */
	public void switchWindow(int index);
	
	/**
	 * 
	 */
	public void alertAccept();
	
	/**
	 * 
	 */
	public void alertDismiss();
	
	/**
	 * @return
	 */
	public String alertGetText();
	
	/**
	 * @param ele
	 */
	public void switchToFrame(WebElement ele);
	
	/**
	 * @param ele
	 * @param value
	 * @return
	 */
	public boolean VerifyTitle(WebElement ele, String value);
	
	/**
	 * @param ele
	 * @param value
	 * @return
	 */
	public String getAttribute(WebElement ele, String value);
	
	/**
	 * @param ele
	 * @return
	 */
	public String getText(WebElement ele);
	
	/**
	 * @param ele
	 * @param value
	 * @return
	 */
	public boolean verifyText(WebElement ele, String value);
	
	/**
	 * @param browser
	 * @param url
	 */
	public void invokeApp(String browser, String url);
	
	/**
	 * 
	 */
	public void closeBrowser();
	

}
