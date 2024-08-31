package Beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Beginner/B-1.18-PageSource.html");
		
		String html_source =driver.getPageSource();
		
		driver.findElement(By.xpath("//textarea[@id='textInput']")).sendKeys(html_source);
		
		WebElement x= driver.findElement(By.xpath("//div[@id='message']"));
		if(x.getText().equals("Success! Page source entered")) {
			System.out.println("Success");
		}
		else {System.out.println("Failed");}

	}

}
