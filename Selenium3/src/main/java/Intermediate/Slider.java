package Intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://softwaretestingpro.github.io/Automation/Intermediate/I-2.08-Slider.html");
		WebElement wb = driver.findElement(By.xpath("//input[@type='range']"));
		
		Actions ac = new Actions(driver);
		
		ac.dragAndDropBy(wb,60,0).perform();
	}

}
