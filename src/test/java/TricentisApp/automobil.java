package TricentisApp;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.Automobil;
import pageObjects.HomePage;
import resources.base;

public class automobil extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("driver is inizialized");
		

	}

	@Test(priority = 10)
	public void AutomobilSection() throws IOException {

		HomePage navigation = new HomePage(driver);
		driver.get("http://sampleapp.tricentis.com/101/");
		driver.findElement(By.id("nav_automobile")).click();
		Automobil objects = new Automobil(driver);
		Select DropBoxMake = new Select(driver.findElement(By.id("make")));
		DropBoxMake.selectByVisibleText("BMW");
		//objects.engineperformance().sendKeys("100");
		driver.findElement(By.id("engineperformance"));
		objects.dateofmanufacture().sendKeys("12/12/2000");
		new Select(objects.numberofseats()).selectByIndex(4);
		new Select(objects.fuelType()).selectByIndex(2);
		objects.listprice().sendKeys("100");
		objects.licensePlate().sendKeys("w1111");
		objects.mileage().sendKeys("200000");
		objects.nextButton().click();
		
		
		//Assert.assertFalse("failed", objects.courtesycar().isDisplayed());
	}

	@AfterTest
	public void teardown() {
		driver.quit();
		driver = null;
	}

}
