package Authendication;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	
	public final static String driver_Path= "C:\\Users\\white\\OneDrive\\Desktop\\Driver Path\\chromedriver.exe";
	public static WebDriver driver;	
	public final static String url = "https://yourstore.io";
	public final static String name = "Storehook";
	public final static String mobile_num ="1234567890";
//	public final static String email = "banuyourstore@gmail.com";
    public final static String password ="Banu@Yourstore.io";
    public final static String store_name ="StoreHook";
	public final static String address = "14, Gulmohar Avenue, Velachery Rd, Guindy, Chennai, Tamil Nadu 600032";
	public final static String city = "Chennai";
	public final static String pincode = "600032";
	public final static String GST = "6358734987664364";
	public final static String description ="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s";
	
	
	@BeforeSuite
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", driver_Path);
		//Create a map to store  preferences 
				Map<String, Object> prefs = new HashMap<String, Object>();
				    
				//add key and value to map as follow to switch off browser notification
				//Pass the argument 1 to allow and 2 to block
				prefs.put("profile.default_content_setting_values.notifications", 2);
				    
				//Create an instance of ChromeOptions 
				ChromeOptions options = new ChromeOptions();
				    
				// set ExperimentalOption - prefs 
				options.setExperimentalOption("prefs", prefs);
				
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();
	}
	
	@BeforeTest
	public void openUrl()
	{
		driver.get(url);
	}

	
	
	
	

}
