package pageobjects;

import org.openqa.selenium.WebDriver;



// creating objects for all page object files
public class PageObjectManager {
	public WebDriver driver; 
	public Demo demo;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public Demo getDemo() {
		demo = new Demo(driver);
		return demo;
	}
	
	
	
}
