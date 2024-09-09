package Intermediate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Intermediate/I-2.09-RandomButtons.html");
		
		List<WebElement> buttons  = driver.findElements(By.xpath("//div[@id='buttonContainer']/button"));
		int b = buttons.size();
		System.out.println(b);
		String bstr = Integer.toString(b);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(bstr);
	}

}
