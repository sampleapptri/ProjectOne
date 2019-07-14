package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class base {
	public static WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {
		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\User\\ProjectSampleApp\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		String Key1 = "firefox";
		String Key2 = "chrome";
		if (browserName.equals(Key2)) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\User\\Desktop\\WebDriverlocation\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals(Key1)) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\User\\Desktop\\WebDriverlocation\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (!browserName.contentEquals(Key2) && browserName.contentEquals(Key1)) {
			throw new NoSuchContextException("Konfiguration not found");
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public void getScreenshot(String result) throws IOException {
		//File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src1, new File("C:\\Users\\User\\ProjectSampleApp\\Screenshots\\"+result+"Screenshot.png"));
		//FileUtils.copyFile(src1, new File("C:\\Users\\User\\Desktop\\SeleniumScreenshots\\screen.png"));
		//File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(src1, new File("C:/Users/User/Desktop/SeleniumScreenshots/"+result+"Screenshot.png"));
		 TakesScreenshot ts=(TakesScreenshot)driver;
	     FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\User\\Desktop\\SeleniumScreenshots\\screen.png"));
	}
}
