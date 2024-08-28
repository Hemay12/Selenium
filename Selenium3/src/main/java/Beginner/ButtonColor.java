package Beginner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class ButtonColor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Beginner/B-1.04-Color.html");
		WebElement color = driver.findElement(By.xpath("//button[@class='colorful-button']"));
		String bgcolor = color.getCssValue("background-color");
		String hex = Color.fromString(bgcolor).asHex();
		System.out.println(bgcolor);
		driver.findElement(By.xpath("//input[@id='user-input1']")).sendKeys(hex);
		
		Actions ac = new Actions(driver);	
		ac.moveToElement(color).perform();
		TimeUnit.MILLISECONDS.sleep(200);
		String bgcolor1 = color.getCssValue("background-color");
		String hex1 = Color.fromString(bgcolor1).asHex();
		System.out.println(bgcolor1);
		driver.findElement(By.xpath("//input[@id='user-input2']")).sendKeys(hex1);
		
		ac.clickAndHold(color).perform();
		TimeUnit.MILLISECONDS.sleep(300);
		String bgcolor2 = color.getCssValue("background-color");
		String hex2 = Color.fromString(bgcolor2).asHex();
		System.out.println(bgcolor2);
		driver.findElement(By.xpath("//input[@id='user-input3']")).sendKeys(hex2);
				
	}

}
