package relevelAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rohin\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().to("https://www.bing.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().to("https://duckduckgo.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		//PomClass p=new PomClass(Diver);
		
		
	
		
		
		
		
		
		
	}

}
