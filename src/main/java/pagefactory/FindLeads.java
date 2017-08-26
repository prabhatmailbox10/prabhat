package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FindLeads extends BasePage{
	
	public FindLeads(){
		PageFactory.initElements(eventDriver, this);
	}
	
	/*@FindBy(how = How.LINK_TEXT, using = "Find Leads")
	WebElement findLeads;
	
	public FindLeads clickFindLeadsShortcut(){
		
		clickByLocator(findLeads);
		return this;
	}*/
	
	@FindBy(how = How.LINK_TEXT, using = "Phone")
	WebElement phone;
	
	public FindLeads clickPhone(){
		clickByLocator(phone);
		return this;
	}
	
	@FindBy(how = How.NAME, using = "phoneCountryCode")
	WebElement countryCode;
	
	public FindLeads clearCountryCode(){
		clearTextField(countryCode);
		return this;
	}
	
	@FindBy(how = How.NAME, using = "phoneNumber")
	WebElement honeNumber;
	
	public FindLeads enterPhoneNumber(String phone){
		enterValue(honeNumber, phone);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	WebElement findLeadsBtn;
	
	public FindLeads clickFindLeadsBtn(){
		clickByLocator(findLeadsBtn);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//a[@class = 'linktext'])[4]")
	WebElement firstLead;
	
	public FindLeads getFirstLead(){
		firstLeadId = getText(firstLead);
		System.out.println("First Lead in search :: " +firstLeadId);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//a[@class = 'linktext'])[4]")
	WebElement firstLeadLink;
	
	public ViewLeads clickFirstLeadId(){
		clickByLocator(firstLeadLink);
		return new ViewLeads();
	}
//	
	@FindBy(how = How.NAME, using = "id")
	WebElement leadID;
	
	public FindLeads putLeadId(String value){
	    enterValue(leadID, value);//this value will be called from the test case
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//div[@class='x-paging-info']")
	WebElement errorMsg;
	
	public FindLeads getErrorMsg(String erMessage){
		
		verifyText(errorMsg, erMessage);
		
		//errorMssage = getText(errorMsg);
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
