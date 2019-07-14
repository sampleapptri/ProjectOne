package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	By nav_Automobil = By.id("nav_automobile");
	By nav_Truck = By.cssSelector("#nav_truck");
	By nav_Motorcycle = By.cssSelector("#nav_motorcycle");
	By nav_Camper = By.cssSelector("#nav_camper");



	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement Automobil () {
		return driver.findElement(nav_Automobil);	
	}
	
	public WebElement Truck () {
		return driver.findElement(nav_Truck);
	}
	
	public WebElement Motorcycle () {
		return driver.findElement(nav_Motorcycle);
	}
	
	public WebElement Camper () {
		return driver.findElement(nav_Camper);
	}
	

}
