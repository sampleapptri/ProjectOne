package TricentisApp;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Automobil;
import pageObjects.HomePage;
import resources.base;

public class Truck extends base {
	
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("driver is inizialized");
	}
	
	@Test
	public void TruckTest() {
		HomePage nav = new HomePage(driver);
		driver.get("http://sampleapp.tricentis.com/101/#");
		driver.findElement(By.id("nav_truck")).click();
		Assert.assertTrue(driver.findElement(By.id("make")).isDisplayed(), "Looking for Element...");
		Automobil objects = new Automobil(driver);
		new Select(driver.findElement(By.id("make"))).selectByIndex(3);
		objects.engineperformance().sendKeys("200");
		objects.dateofmanufacture().sendKeys("12/12/2000");
		new Select(objects.numberofseats()).selectByVisibleText("4");
		Assert.assertTrue(objects.nextButtonSendQuote().isDisplayed(), "Button is Displayed");
	}
	@AfterTest
	public void teardown() {
		driver.quit();
		driver = null;
	}


}
