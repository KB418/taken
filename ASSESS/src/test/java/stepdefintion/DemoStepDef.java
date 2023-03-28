package stepdefintion;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Demo;
import pageobjects.OR;
import pageobjects.PageObjectManager;
import utils.TestContextSetup;

public class DemoStepDef {
	PageObjectManager pageObjectManager;
	WebDriver driver;
	TestContextSetup testContextSetup;
	Demo demo;
	
	
	
	public DemoStepDef(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.demo = testContextSetup.pageObjectManager.getDemo();
	}



	@Given("Land on youtube homepage")
	public void land_on_youtube_homepage() {

	}

	@When("I search for {string}")
	public void i_search_for(String searchWord) {
		demo.search(searchWord);
		
	}

	@When("click search button")
	public void click_search_button() {
		
		demo.clickSearchButton();
		
	}

	@Then("verify search results")
	public void verify_search_result(String verifyWord) throws InterruptedException {
		System.out.println("Search processing>>>>>>>>>>");
		demo.VerifyTitle(verifyWord);
		System.out.println("verified "+ verifyWord);
		

     }
	@When("^I search for (.+)$")
	public void i_searched_for(String searchWords) {
		demo.search(searchWords);
		System.out.println("Searching for >> "+searchWords);
	}
	
	@Then("^verify search results (.+)$")
	public void verify_search_results(String verifyWords) throws InterruptedException {
		demo.VerifyTitle(verifyWords);
		System.out.println("verified "+ verifyWords);
	}
	@Then("close the browser")
	public void close_the_browser() throws IOException {
	testContextSetup.testBase.WebDriverManager().quit();

	}
	

}
