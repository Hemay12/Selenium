package Intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Intermediate/I-2.20-ValueInput.html");
		
		Actions ac = new Actions(driver);
		WebElement copy = driver.findElement(By.xpath("//input[@id='inputField1']"));
		//WebElement paste = driver.findElement(By.xpath("//input[@id='inputField2']"));
		ac.doubleClick(copy).build().perform();
		copy.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.xpath("//input[@id='inputField2']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		

	}

}
