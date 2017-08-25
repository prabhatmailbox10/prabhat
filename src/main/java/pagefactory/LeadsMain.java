package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LeadsMain extends BasePage{
	
	public LeadsMain(){
		PageFactory.initElements(eventDriver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Leads")
	WebElement leads;
	
	public FindLeads clickFindLeads(){
		clickByLocator(leads);
		return new FindLeads();
	}
	
	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	WebElement findLeadsBtn;
	
	public FindLeads clickFindLeadsBtn(){
		clickByLocator(findLeadsBtn);
		return new FindLeads();
	}

}
