package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
	
	
	public LoginPage(){
		PageFactory.initElements(eventDriver, this);
	}
	
	@FindBy(how = How.ID, using = "username")
	WebElement uName;
	
	public LoginPage typeUserName(){
		enterValue(uName, "DemoSalesManager");
		return this;
	}
	
	@FindBys({
		@FindBy(how = How.ID, using = "password"),
		@FindBy(how = How.NAME, using = "PASSWORD")
	})
	WebElement password;
	
	public LoginPage typePassword(){
		enterValue(password, "crmsfa");
		return this;
	}
	
	@FindAll({
		@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit"),
		@FindBy(how = How.NAME, using = "LOGIN")
	})
	WebElement loginBtn;
	
	public HomePage clickLoginButton(){
		
		clickByLocator(loginBtn);
		return new HomePage();
		
	}
	
}
