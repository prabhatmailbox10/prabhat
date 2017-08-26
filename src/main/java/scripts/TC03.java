package scripts;


import org.testng.annotations.Test;

import wrappers.GenericAnnotations;


public class TC03 extends GenericAnnotations{
	@Test
	public void deleteLead(){
		//invokeApp("chrome", url);
		enterValue(locateElement("id", "username"), "DemoSalesManager");
		enterValue(locateElement("id", "password"), "crmsfa");
		//clickByLocator(locateElement("className", "decorativeSubmit"));
		clickByLocator(locateElement("type", "submit"));
		clickByLocator(locateElement("linkText", "CRM/SFA"));
		clickByLocator(locateElement("linkText", "Leads"));
		clickByLocator(locateElement("linkText", "Find Leads"));
		clickByLocator(locateElement("linkText", "Phone"));
		clearTextField(locateElement("name", "phoneCountryCode"));
		enterValue(locateElement("name", "phoneNumber"), "9543076486");
		clickByLocator(locateElement("xpath", "//button[text()='Find Leads']"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String firstLead = getText(locateElement("xpath", "(//a[@class = 'linktext'])[4]"));//first resulting lead
		System.out.println("First Lead in search :: " +firstLead);
		clickByLocator(locateElement("xpath", "(//a[@class = 'linktext'])[4]"));
		clickByLocator(locateElement("linkText", "Delete"));
		clickByLocator(locateElement("linkText", "Find Leads"));
		enterValue(locateElement("name", "id"), firstLead);
		clickByLocator(locateElement("xpath", "//button[text()='Find Leads']"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String errorMsg = getText(locateElement("xpath", "//div[@class='x-paging-info']"));
		System.out.println("Error Message :: "+errorMsg);
		String verifyNoLeadMsg = getText(locateElement("xpath", "//div[@class='x-paging-info']"));
		System.out.println("Verify Deleted Leads not present in list "+verifyNoLeadMsg);
		//closeBrowser();
		
		
		
		
		
	}

}
