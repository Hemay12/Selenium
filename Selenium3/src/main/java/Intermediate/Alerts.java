package Intermediate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Intermediate/I-2.10-Alerts.html");
		
		driver.findElement(By.xpath("//button[@class='button alert-button']")).click();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		String a1 = alert.getText();
		alert.accept();
		
		System.out.println("Show alert completed");
		
		driver.findElement(By.xpath("//button[@class='button confirm-button']")).click();
		Thread.sleep(2000);
		alert.accept();
		alert.accept();
		
		System.out.println("Show confirm alert completed");
		
		WebElement x= driver.findElement(By.xpath("//button[@class='button prompt-button']"));
		x.click();
		alert.sendKeys("Hemay");
		Thread.sleep(1000);
		alert.accept();
		alert.accept();
		
		//alert.dismiss();
		Thread.sleep(1000);
		
		System.out.println("Show propmt alert completed");

		WebElement y = driver.findElement(By.xpath("//button[@class='button custom-button']"));
		y.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Close']")).click();

	}

}
