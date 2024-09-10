package Intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Intermediate/I-2.12-Frame.html");
		
		driver.switchTo().frame("button-frame");
		driver.findElement(By.xpath("//button[@class='button']")).click();
		
		driver.switchTo().defaultContent();

	}

}
