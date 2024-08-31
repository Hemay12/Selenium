package Beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyStroke {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Beginner/B-1.14-Keystroke.html");
		
		Actions actions = new Actions(driver);
        WebElement body = driver.findElement(By.tagName("body"));
        
        WebElement text = driver.findElement(By.xpath("//span[@id='random-key']"));
        String x = text.getText();
        System.out.println(text.getText());
        
        actions.click(body).sendKeys(x).perform();	

	}

}
