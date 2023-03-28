package utils;
import java.io.IOException;

//Objects to be shared across StepDefinition
import org.openqa.selenium.WebDriver;

import pageobjects.OR;
import pageobjects.PageObjectManager;
// >>>>>>heart of framework
// >>>>>>>> passes driver everywhere

public class TestContextSetup {
	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	public OR oR;
	public TestContextSetup() throws IOException {
		testBase = new TestBase();
		pageObjectManager = new	PageObjectManager(testBase.WebDriverManager());
		genericUtils = new GenericUtils(testBase.WebDriverManager());
		oR = new OR(testBase.WebDriverManager());
	}

}
