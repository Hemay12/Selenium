package Beginner;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Beginner/B-1.05-Checkboxes.html");
		
		driver.findElement(By.xpath("//input[@value='music']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();	
		
		TimeUnit.MILLISECONDS.sleep(300);
		
		WebElement successmessage= driver.findElement(By.xpath("//div[@id='successMessage']"));
		String text = successmessage.getText();
		if(text.equals("You have selected \"Music\" and the 3rd option.")) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failed");
		}

	}

}
