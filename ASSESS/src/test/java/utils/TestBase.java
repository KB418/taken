package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	public WebDriver driver;
	
	
	public WebDriver WebDriverManager() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("Url");
		
		
		if (driver==null) {
			
			if(prop.getProperty("Browser").equalsIgnoreCase("chrome")) {				
			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			driver.manage().window().maximize();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.get(url);
			}
			
			if (prop.getProperty("Browser").equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "Driver/Edgedriver.exe");
				WebDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().deleteAllCookies();
			}
			
			if (prop.getProperty("Browser").equalsIgnoreCase("firefox")) {
				
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
			
		}
		return driver;
}
}
