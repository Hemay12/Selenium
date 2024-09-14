package Intermediate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Intermediate/I-2.19-FetchDate.html");	
		System.out.println(LocalDate.now());
		LocalDate str = LocalDate.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String str1 = str.format(formatter);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(str1);
	}

}
