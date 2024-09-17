package Advanced;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DownloadFile {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Advanced/A-3.02-Download.html");
		driver.findElement(By.xpath("//a[@class='download-link']")).click();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("chrome://downloads");
		
		File download = new File("C:\\Users\\Hemay_Sorathiya\\Downloads\\100mb.zip");
		boolean isDownload = false;
		
		long startTime = System.currentTimeMillis();
		long timeAvailable = 4000 + System.currentTimeMillis();
		
		while(startTime < timeAvailable) {
			if(download.exists()) {
				isDownload = true;
				break;
			}	
		}
		long endTime = System.currentTimeMillis();
		long durationMillis = endTime - startTime;
		double durationSeconds = durationMillis / 1000.0;  // Convert milliseconds to seconds
		System.out.println("Time taken: " + durationSeconds + " seconds");
		Actions ac = new Actions(driver);
        ac.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys(Keys.TAB).build().perform();
        // Bring focus to the window
        driver.switchTo().window(driver.getWindowHandle());
        
        

		
		driver.findElement(By.xpath("//input[@id='user-input']")).sendKeys(String.valueOf(durationSeconds));
		
	}
}
