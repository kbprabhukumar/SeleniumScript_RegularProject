

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "lib/IEDriverServer.exe");
		//driver= new InternetExplorerDriver();
		
		//System.setProperty("webdriver.ie.driver", "lib/MicrosoftWebDriver.exe");
		//driver= new InternetExplorerDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		
		
		 	
		 
		
		
		//driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title = " + title);
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
	}

}
