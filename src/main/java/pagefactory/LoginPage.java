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
	
	public LoginPage typeUserName(String username){
		enterValue(uName, username);
		return this;
	}
	
	@FindBys({
		@FindBy(how = How.ID, using = "password")})
	WebElement passWd;
	
	public LoginPage typePassword(String password){
		enterValue(passWd, password);
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
