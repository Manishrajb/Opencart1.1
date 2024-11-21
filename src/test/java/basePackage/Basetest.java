package basePackage;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class Basetest 
{
	public WebDriver driver;
	public Properties pr;
	
	@BeforeClass(groups = {"sanity","regression"})
	@Parameters({"browser"})
	public void browserlaunch(String br) throws IOException
	{
		FileReader file = new FileReader("./src//test//resources//config.properties");
		pr = new Properties();
		pr.load(file);
		
		switch(br)
		{
			case "chrome" : driver = new ChromeDriver(); break;
			case "edge" : driver = new EdgeDriver(); break;
			default : System.out.println("Invalid browser");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(pr.getProperty("appUrl2"));
//		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}
	
	@AfterClass(groups = {"sanity", "regression"})
	public void browserclose()
	{
		driver.close();
	}
	
	public String randumstring()
	{
		return RandomStringUtils.randomAlphabetic(5);
	}
}
