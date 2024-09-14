package Intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagePosition {

	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Intermediate/I-2.26-ImagePosition.html");
		
		WebElement wb = driver.findElement(By.xpath("//div[@class='images']//img[1]"));
		String str  = wb.getAttribute("id");
		if (str == "image1") {
			str = "Image 1";
		}
		else {
			str = "Image 2";
		}
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(str);
	}

}
