package Intermediate;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortNumbers {

	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Intermediate/I-2.22-SortNumbers.html");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='number-box']"));
		int a = list.size();
		System.out.println(a);
		int arr[] = new int[a];
 		for(int i= 0; i<a;i++) {
			WebElement x =list.get(i);
			String str = x.getText();
			int j = Integer.parseInt(str);
			arr[i]=j;
		}
 		
 		System.out.println(Arrays.toString(arr));
 		Arrays.sort(arr);
 		System.out.println(Arrays.toString(arr));
 		
 		List<WebElement> list1 = driver.findElements(By.xpath("//input[@type='text']"));
 		for(int i =0; i<a;i++) {
 			WebElement y = list1.get(i);
 			y.sendKeys(Integer.toString(arr[i]));
 		}

	}

}
