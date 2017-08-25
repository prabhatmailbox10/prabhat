package pagefactory;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

	public HomePage(){
		PageFactory.initElements(eventDriver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using = "CRM/SFA")
	WebElement crmsfaLink;
	
	public CrmsfaPage clickCrmsfaLink(){
		clickByLocator(crmsfaLink);
		return new CrmsfaPage();
		
	}
}
