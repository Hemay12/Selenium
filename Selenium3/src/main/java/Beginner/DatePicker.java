package Beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class DatePicker {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Beginner/B-1.15-DatePicker.html");
		
		WebElement b = driver.findElement(By.xpath("//div[@class='date-picker-wrapper']//*[name()='svg']"));
		Actions ac = new Actions(driver);
		ac.click(b).sendKeys(Keys.ENTER).perform();

	}

}
