package Intermediate;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortWord {

	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Intermediate/I-2.24-SortWords.html");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='word-box']"));
		int a = list.size();
		System.out.println(a);
		String arr[] = new String[a];
 		for(int i= 0; i<a;i++) {
			WebElement x =list.get(i);
			String str = x.getText();
			arr[i]=str;
			System.out.print(arr[i]);
		}
 		
 		
 		Arrays.sort(arr);
 		System.out.println(Arrays.toString(arr));
 		
 		List<WebElement> list1 = driver.findElements(By.xpath("//input[@type='text']"));
 		for(int i =0; i<a;i++) {
 			WebElement y = list1.get(i);
 			y.sendKeys((arr[i]));
 		}

	}

}
