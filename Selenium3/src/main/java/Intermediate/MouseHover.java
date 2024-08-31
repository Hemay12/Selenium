package Intermediate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Intermediate/I-2.02-HoverLink.html");
		
		WebElement x =driver.findElement(By.xpath("//div[@class='image-container']"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(x).perform();
		
		driver.findElement(By.xpath("//div[@class='image-overlay']")).click();

	}

}
