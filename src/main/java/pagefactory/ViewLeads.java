package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewLeads extends BasePage{
	
	public ViewLeads(){
		PageFactory.initElements(eventDriver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Delete")
	WebElement delete;
	
	public LeadsMain clickDeleteBtn(){
		clickByLocator(delete);
		return new LeadsMain();
	}

}
