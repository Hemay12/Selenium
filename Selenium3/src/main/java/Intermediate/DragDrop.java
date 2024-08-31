package Intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Intermediate/I-2.01-DragAndDropText.html");
		
		WebElement x = driver.findElement(By.xpath("//div[@class='draggable']"));
		WebElement y = driver.findElement(By.xpath("//div[@id='container2']"));
		Actions ac =new Actions(driver);
		ac.dragAndDrop(x, y).perform();

	}

}
