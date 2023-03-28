package utils;
import org.openqa.selenium.WebDriver;

import pageobjects.Demo;


public class GenericUtils {
	public WebDriver driver;
	public TestContextSetup testContextSetup;
	
	
public GenericUtils(WebDriver driver) {
	this.driver= driver;
	
}
public void VerifySearch(String verify) {
	Demo demo=testContextSetup.pageObjectManager.getDemo();
//	if (title.contains(verify)) {
//		System.out.println("Search result passed for"+ verify);
//	}
//	else {
//		System.out.println("Not matched>>>>");
//	}

}


	
	
}
