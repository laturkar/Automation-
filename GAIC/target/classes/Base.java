package resource;

//import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
//import org.apache.logging.log4j.core.util.FileUtils;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;



public class Base {

	public  static WebDriver driver;
	public  Properties prop;
	public WebDriver  InitializeDriver() throws IOException {
		 prop=new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\crative\\SDET\\src\\main\\java\\resource\\Data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
			driver=new ChromeDriver();
		/*	ChromeOptions option= new ChromeOptions();
			//run test cases in headless mode
			if(browserName.contains("headless"))
			{
			option.addArguments("headless");
			}
		   driver= new ChromeDriver(option);*/
			
		}
		else if(browserName.equals("firefox")) 
		{
			//driver=new firefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			
		}
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
		
	}
	
	
	/*public void getScreenshot(String result) throws IOException 
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://Work//+result+screenshot.png"));	
	}*/
}
