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

public class ContactDetails {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prt = new Properties();
		FileInputStream inputstream = new FileInputStream("C:\\Users\\VINAY N\\eclipse-workspace\\AutomationEcap1\\src\\test\\java\\Project2\\Properites.properties");
		prt.load(inputstream);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(prt.getProperty("Url"));
		driver.findElement(By.xpath(prt.getProperty("contact"))).click();
		WebElement name=driver.findElement(By.xpath(prt.getProperty("ContactName")));
		name.sendKeys(prt.getProperty("name3"));
		WebElement mail=driver.findElement(By.xpath(prt.getProperty("ContactMail")));
		mail.sendKeys(prt.getProperty("mail"));
		WebElement num=driver.findElement(By.xpath(prt.getProperty("ContactNumber")));
		num.sendKeys(prt.getProperty("num"));
		WebElement message=driver.findElement(By.xpath(prt.getProperty("ContactMessage")));
		message.sendKeys(prt.getProperty("Message"));
		
		WebElement click=driver.findElement(By.xpath(prt.getProperty("ContactClick")));
		click.click();
		
	}

}
