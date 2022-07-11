package noBroker1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Round3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rohin\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();      //maximize windows
		driver.manage().deleteAllCookies();        //delete all cookies
		
		
		driver.navigate().to("https://www.nobroker.in/");
		

		WebElement SearchBox=driver.findElement(By.xpath("//button[@class='prop-search-button btn btn-primary btn-lg']"));
		SearchBox.click();
		
		WebElement searchcity=driver.findElement(By.xpath("//div[@class='css-1wy0on6 nb-select__indicators'][1]"));
		
		searchcity.click();
		
		//WebElement searchicon=driver.findElement(By.xpath("//*[@id='searchCity']/div/div[2]/div)"));
		//searchicon.click();
		
		
//		 
//	      // getting the list of elements with the xpath
//	      List<WebElement> opt = driver.findElements(By.xpath("//select[@name='birthday_day']"));
//	      int s = opt.size();
//	      // Iterating through the list selecting the desired option
//	      for( int j = 0; j< opt.size();j++){
//	         // if the option is By Subject click that option
//	         if( opt.get(j).getText().equals("Pune")){
//	            opt.get(j).click();
//	            break;
//	         }
//	      }
//	      //driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		List<WebElement>list=driver.findElements(By.xpath("//*[@id=\'app\']/div/div/div[1]/div[4]/div[1]/div"));
		System.out.println(list.size());
		int count =0;
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			
		count++;
		
		
			
			if(list.get(i).getText().contains("Pune"))
{
				list.get(i).click();
				
				break;
				
		}
			
			System.out.println(count);
		
//			
//			for(int i=0;i<list.size();i++)
//			{
//				System.out.println(list.get(i).getText());
//				list.get(i).click();
}
				
				
				
	
}
			
			
			
		}
		
	



		
		



		
		
		
	

	
		

		
		
		
		
		



































