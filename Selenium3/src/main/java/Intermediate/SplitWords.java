package Intermediate;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SplitWords {

	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Intermediate/I-2.25-SplitWords.html");
		
		WebElement x = driver.findElement(By.xpath("//div[@class='sentence']"));
		String str = x.getText();
		
		String arr[] = str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='text']"));
		
		for(int i =0; i<list.size();i++) {
			list.get(i).sendKeys(arr[i]);
		}
	}

}
