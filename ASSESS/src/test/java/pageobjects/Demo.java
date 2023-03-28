package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Demo {
public WebDriver driver;
	public Demo(WebDriver driver) {
		this.driver=driver;
	}
	By searchBox = By.xpath("//input[@id='search']");
	By searchButton = By.xpath("//button/yt-icon[@class='style-scope ytd-searchbox']");
	By searchTitle = By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]");
	
	
	
//////////////////////methods	////////////////////////////////
	
	public void search(String searchValue) {
		driver.findElement(searchBox).sendKeys(searchValue);
		
	}
	public void clickSearchButton() {
		driver.findElement(searchButton).click();
	}
	public String VerifyTitle(String verifyWord) {
		String title =driver.findElement(searchTitle).getText().trim();
		if (title.contains(verifyWord)) {
			System.out.println("Search result passed for "+ verifyWord);
		}
		;
		return title;
}
	
	
	
}
