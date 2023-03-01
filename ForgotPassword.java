package Project2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgotPassword {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prt = new Properties();
		FileInputStream inputstream = new FileInputStream("C:\\Users\\VINAY N\\eclipse-workspace\\AutomationEcap1\\src\\test\\java\\Project2\\Properites.properties");
		prt.load(inputstream);
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get(prt.getProperty("Url"));
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText(prt.getProperty("forgotlinkedText"))).click();
		
		WebElement firstname=driver.findElement(By.xpath(prt.getProperty("firstnamexpath1")));
		firstname.sendKeys(prt.getProperty("name1"));
		WebElement lastName = driver.findElement(By.xpath(prt.getProperty("lastnamexpath")));
		lastName.sendKeys(prt.getProperty("lastname"));
		WebElement add = driver.findElement(By.xpath(prt.getProperty("Addresxpath")));
		add.sendKeys(prt.getProperty("Address"));
		WebElement city = driver.findElement(By.xpath(prt.getProperty("cityxpath")));
		city.sendKeys(prt.getProperty("city"));
		WebElement state  = driver.findElement(By.xpath(prt.getProperty("statexpath")));
		state.sendKeys(prt.getProperty("state"));
		WebElement zip  = driver.findElement(By.xpath(prt.getProperty("zipcodexpath")));
		zip.sendKeys(prt.getProperty("zipcode"));
		WebElement ssn  = driver.findElement(By.xpath(prt.getProperty("ssnxpath")));
		ssn.sendKeys(prt.getProperty("ssn"));
		WebElement click  = driver.findElement(By.xpath(prt.getProperty("finxpath")));
		click.click();
		
	
		
	}

}
