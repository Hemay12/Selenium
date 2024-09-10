package Intermediate;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RandomAlert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Intermediate/I-2.15-RandomPopUp.html");
		
		driver.findElement(By.xpath("//a[@id='alertButton']")).click();
		long startTime = System.currentTimeMillis();
		WebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(30));
		wb.until(ExpectedConditions.alertIsPresent());
		long endTime = System.currentTimeMillis();
		
		long duration = (endTime - startTime)/1000;
        System.out.println("Time taken for alert to appear: " + duration + " milliseconds");
		
		Alert alert = driver.switchTo().alert();
		System.out.println("ALert generated");
		alert.accept();
		
		driver.findElement(By.xpath("//input[@id='inputField']")).sendKeys(String.valueOf(duration));;

	}

}
