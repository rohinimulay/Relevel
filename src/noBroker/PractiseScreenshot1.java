package noBroker;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;



public class PractiseScreenshot1 {

	public static void takeScreenShot(WebDriver driver,String name) throws IOException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\rohin\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
WebDriver driver1 = new ChromeDriver();
driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

driver.manage().window().maximize();
WebElement product =driver.findElement(By.xpath("//select[@id='first']"));


Select a =new Select(product);
a.selectByValue("Yahoo");


String d =PractiseScreenshot1 .date();

File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

File destination =new File("C:\\Users\\rohin\\OneDrive\\Documents\\Screenshort\\"+name + d+".jpg");
FileHandler.copy(source, destination);

}
public static String date() {
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");
LocalDateTime currentTime =LocalDateTime.now();
String d =dtf.format(currentTime);

return d;

}
}



