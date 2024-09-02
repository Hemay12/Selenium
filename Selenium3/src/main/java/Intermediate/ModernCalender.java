package Intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModernCalender {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Intermediate/I-2.04-Calendar.html");
		
		WebElement x = driver.findElement(By.xpath("//table[@class='calendar-table']"));
		x.findElement(By.xpath(".//tr[1]/td[4]")).click();
		WebElement y = driver.findElement(By.xpath("//span[@id='result1']"));
		if(y.getText().equals("✘") || y.getText().equals("")) {
			x.findElement(By.xpath(".//tr[2]/td[4]")).click();
		}
		System.out.println(y.getText());	
		
	}

}
