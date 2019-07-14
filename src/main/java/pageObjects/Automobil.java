package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Automobil {
	WebDriver driver;
	By engineperformance = By.id("engineperformance");

	public Automobil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement engineperformance() {
		return driver.findElement(engineperformance);
	}

	By dateofmanufacture = By.id("dateofmanufacture");

	public WebElement dateofmanufacture() {
		return driver.findElement(dateofmanufacture);
	}

	By numberofseats = By.id("numberofseats");
	WebElement numberOfSeats;

	public WebElement numberofseats() {
		return driver.findElement(numberofseats);
	}

	By fuelType = By.id("fuel");

	public WebElement fuelType() {
		return driver.findElement(fuelType);
	}

	By listPrice = By.id("listprice");

	public WebElement listprice() {
		return driver.findElement(listPrice);
	}

	By licensePlateNumber = By.id("licenseplatenumber");

	public WebElement licensePlate() {
		return driver.findElement(licensePlateNumber);
	}

	By annualmileage = By.id("annualmileage");

	public WebElement mileage() {
		return driver.findElement(annualmileage);
	}

	By nextButton1 = By.id("nextenterinsurantdata");

	public WebElement nextButton() {
		return driver.findElement(nextButton1);
	}

	By firstName = By.id("firstname");

	public WebElement firstname() {
		return driver.findElement(firstName);
	}

	By lastName = By.id("lastname");
	WebElement famName;

	public WebElement famName() {
		return this.famName;
	}

	By dateOfBirt = By.cssSelector("div.ui-datepicker.ui-widget.ui-widget-content.ui-helper-clearfix"
			+ ".ui-corner-all:nth-child(2) table.ui-datepicker-calendar tbody:nth-child(2) tr:nth-chi"
			+ "ld(2) td:nth-child(3) > a.ui-state-default");

	public WebElement dateOfBirth() {
		return driver.findElement(dateOfBirt);
	}

	By gender = By.xpath("//label[text()='Male']");

	public WebElement gender() {
		return driver.findElement(gender);
	}

	By adress = By.id("streetaddress");

	public WebElement adress() {
		return driver.findElement(adress);
	}

	By country = By.id("country");

	public WebElement country() {
		return driver.findElement(country);
	}

	By zipcode = By.id("zipcode");

	public WebElement zipcode() {
		return driver.findElement(zipcode);
	}

	By city = By.id("city");

	public WebElement city() {
		return driver.findElement(city);
	}

	By occupation = By.id("occupation");

	public WebElement occupation() {
		return driver.findElement(occupation);
	}

	By hobbies = By.xpath("//input[@id='speeding']");

	public WebElement hobbies() {
		return driver.findElement(hobbies);
	}

	By website = By.id("website");

	public WebElement website() {
		return driver.findElement(website);
	}

	By uploadButton = By.xpath("//input[@id='picture']");

	public WebElement uploadButton() {
		return driver.findElement(uploadButton);
	}

	By NextButton_product_data = By.id("nextenterproductdata");

	public WebElement NextButton_product_data() {
		return driver.findElement(NextButton_product_data);
	}

	By startdate = By.id("startdate]");

	public WebElement startdate() {
		return driver.findElement(startdate);
	}

	By insurancesum = By.id("insurancesum");

	public WebElement insurancesum() {
		return driver.findElement(insurancesum);
	}

	By meritrating = By.id("meritrating");

	public WebElement meritrating() {
		return driver.findElement(meritrating);
	}

	By damageinsurance = By.id("damageinsurance");

	public WebElement damageinsurance() {
		return driver.findElement(damageinsurance);
	}

	By radiobutton_Euro_Protection = By.xpath("//label[text()='Euro Protection']");

	public WebElement Radiobutton_Euro_Protection() {
		return driver.findElement(radiobutton_Euro_Protection);
	}

	By courtesycar = By.id("courtesycar");

	public WebElement courtesycar() {
		return driver.findElement(courtesycar);
	}

	By next_Button_Price_Option = By.xpath("//button[@id='nextselectpriceoption']");

	public WebElement Next_Button_Price_Option() {
		return driver.findElement(next_Button_Price_Option);
	}

	By price_OptionButton = By.xpath("//section[@id='pricePlans']//label[2]//span[1]");

	public WebElement price_OptionButton() {
		return driver.findElement(price_OptionButton);
	}

	By nextButtonSendQuotexpath =By.xpath("//button[@id='nextsendquote']");

	public WebElement nextButtonSendQuote() {
		return driver.findElement(nextButtonSendQuotexpath);
	}

	By email= By.id("email");

	public WebElement email() {
		return driver.findElement(email);
	}

	By phone = By.id("phone");

	public WebElement phoneNumber() {
		return driver.findElement(phone);
	}

	By username = By.id("username");

	public WebElement username() {
		return driver.findElement(username);
	}

	By password = By.id("password");

	public WebElement password() {
		return driver.findElement(password);
	}

	By confirmpassword = By.id("confirmpassword");

	public WebElement confirmpassword() {
		return driver.findElement(confirmpassword);
	}

	By comment = By.id("Comments");

	public WebElement Comment() {
		return driver.findElement(comment);
	}

	By sendMail = By.xpath("//button[@id='sendemail']");

	public WebElement sendMail() {
		return driver.findElement(sendMail);
	}

}
