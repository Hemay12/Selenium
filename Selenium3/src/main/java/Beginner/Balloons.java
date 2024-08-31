package Beginner;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Balloons {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		driver.get("https://softwaretestingpro.github.io/Automation/Beginner/B-1.13-Balloons.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
        
		List<WebElement> balloons = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='balloon']")));
		
		for (WebElement element : balloons) {
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
			Thread.sleep(1000);
			
		}
		
		
	}
}
