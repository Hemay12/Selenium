package Intermediate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableData {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Intermediate/I-2.06-Table.html");
		
		List<WebElement> rows = driver.findElements(By.xpath("//tbody[@id='employeeBody']/tr"));
		int a = rows.size();
		System.out.println(rows.size());
		int max=0,k;
		for (int i =1;i<a+1;i++) {
			WebElement x = driver.findElement(By.xpath("//tbody[@id='employeeBody']/tr["+i+"]/td[3]"));
			String str = x.getText();
			String numericString = str.replaceAll("[^\\d]", "");
			k = Integer.parseInt(numericString);
			if(k>max) {
				max= k;
			}
		}
		//System.out.println(max);
		
		String str3 = String.format("%,d",max);
		System.out.println(str3);
		
		for (int j=1;j<a+1;j++) {
			WebElement cell = driver.findElement(By.xpath("//tbody[@id='employeeBody']/tr["+ j + "]/td[3]"));
			String cellText = cell.getText();
			 if (cellText.contains(str3)) {
	                cell.click();
	                break;
	            }
		}

	}

}
