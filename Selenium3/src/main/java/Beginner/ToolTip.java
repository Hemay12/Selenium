package Beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Beginner/B-1.17-Tooltip.html");
	      WebElement rainbowTextElement = driver.findElement(By.cssSelector(".rainbow-text"));

	        // Create an instance of Actions class to hover over the element
	        Actions actions = new Actions(driver);
	        actions.moveToElement(rainbowTextElement).perform();

	        // Extract the tooltip text from the data-tooltip attribute
	        String tooltipText = rainbowTextElement.getAttribute("data-tooltip");

	        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(tooltipText);
	}

}
