package Project2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterAcc {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Properties prt = new Properties();
		FileInputStream inputstream = new FileInputStream("C:\\Users\\VINAY N\\eclipse-workspace\\AutomationEcap1\\src\\test\\java\\Project2\\Properites.properties");
		prt.load(inputstream);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(prt.getProperty("Url"));
		driver.manage().window().maximize();
		driver.findElement(By.linkText(prt.getProperty("Register"))).click();
	
		
		WebElement firstName = driver.findElement(By.xpath(prt.getProperty("firstnamexapth")));
		firstName.sendKeys(prt.getProperty("firstname"));
		Thread.sleep(10);
		WebElement lastName = driver.findElement(By.xpath(prt.getProperty("lastnamexpath")));
		lastName.sendKeys(prt.getProperty("lastname"));
		WebElement address = driver.findElement(By.xpath(prt.getProperty("addressxpath")));
		address.sendKeys(prt.getProperty("address"));
		WebElement city = driver.findElement(By.xpath(prt.getProperty("cityxpath")));
		city.sendKeys(prt.getProperty("city"));
		WebElement state = driver.findElement(By.xpath(prt.getProperty("Statexpath")));
		state.sendKeys(prt.getProperty("State"));
		WebElement zipCode = driver.findElement(By.xpath(prt.getProperty("Zipcodexpath")));
		zipCode.sendKeys(prt.getProperty("Zipcode"));
		WebElement phoneNumber = driver.findElement(By.xpath(prt.getProperty("phonexpath")));
		phoneNumber.sendKeys(prt.getProperty("phone"));
		WebElement ssn = driver.findElement(By.xpath(prt.getProperty("ssnxpath")));
		ssn.sendKeys(prt.getProperty("ssn"));
		WebElement userName = driver.findElement(By.xpath(prt.getProperty("usernamexpath")));
		userName.sendKeys(prt.getProperty("username"));
		WebElement password = driver.findElement(By.xpath(prt.getProperty("passwordxpath")));
		password.sendKeys(prt.getProperty("password"));
		WebElement confirmPassword = driver.findElement(By.xpath(prt.getProperty("confirmpssxpath")));
		confirmPassword.sendKeys(prt.getProperty("confirmpss"));
		WebElement submit = driver.findElement(By.xpath(prt.getProperty("Submitxpath")));
		submit.click();
	}
}
