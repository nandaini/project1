package Project2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplicationSeeting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prt = new Properties();
		FileInputStream inputstream = new FileInputStream("C:\\Users\\VINAY N\\eclipse-workspace\\AutomationEcap1\\src\\test\\java\\Project2\\Properites.properties");
		prt.load(inputstream);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(prt.getProperty("Url"));
		driver.findElement(By.xpath(prt.getProperty("admin"))).click();
		
		driver.findElement(By.xpath(prt.getProperty("clean"))).click();
		driver.findElement(By.xpath(prt.getProperty("Acess"))).click();
		driver.findElement(By.id(prt.getProperty("DataAcessMode"))).click();
		Select sc=new Select(driver.findElement(By.xpath(prt.getProperty("LoanProvider"))));

}
	}
	

