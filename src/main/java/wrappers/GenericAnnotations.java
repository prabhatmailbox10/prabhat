package wrappers;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GenericAnnotations extends GenericWrappers {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite():::");

	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("beforeTest():::");
	}
	
	@BeforeGroups
	public void beforeGroups(){
		System.out.println("beforeGroups():::");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("beforeClass():::");
	}
	
	@DataProvider
	public void dataProvider(){
		System.out.println("dataProvider():::");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod():::");
		invokeApp("chrome", url);
	}
	
	@Test
	public void test(){
		System.out.println("test():::");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("afterMethod():::");
		closeBrowser();
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("afterClass():::");
	}
	
	@AfterGroups
	public void afterGroups(){
		System.out.println("afterGroups():::");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("afterTest():::");
	}
	
	@AfterSuite
	public void afrerSuite() {
		System.out.println("afterSuite():::");

	}
	

}
