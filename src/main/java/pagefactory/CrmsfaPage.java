package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CrmsfaPage extends BasePage{
	
	public CrmsfaPage(){
		PageFactory.initElements(eventDriver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Leads")
	WebElement crmsfa;
	
	public LeadsMain clickLeadsTab(){
		clickByLocator(crmsfa);
		
		return new LeadsMain();
	}

}
