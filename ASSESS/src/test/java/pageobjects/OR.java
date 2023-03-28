package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OR {
	public WebDriver driver;
	
	
	public OR(WebDriver driver) {
		this.driver=driver;
	}


	private void homePage() {
		By searchbox = By.xpath("//input[@id='search']");
		By searchButton = By.xpath("//button/yt-icon[@class='style-scope ytd-searchbox']");

	}
	
	
}
