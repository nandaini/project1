package Project2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchUrl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prt = new Properties();
		FileInputStream inputstream = new FileInputStream("C:\\Users\\VINAY N\\eclipse-workspace\\AutomationEcap1\\src\\test\\java\\Project2\\Properites.properties");
		prt.load(inputstream);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(prt.getProperty("Url"));
		
		driver.manage().window().maximize();
	}

}
