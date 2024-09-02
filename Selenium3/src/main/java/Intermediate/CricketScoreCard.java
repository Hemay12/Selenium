package Intermediate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricketScoreCard {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Intermediate/I-2.05-CricketScorecard.html");
		
		Map<String, Integer> name = new HashMap<>();
		String bestplayer = null;
		int bestvalue=-1;
		
		List<WebElement> player = driver.findElements(By.xpath("//li[@class='list-group-item']"));
		String[] lines = null;
		
		for(WebElement n : player) {
			
			lines = n.getText().split("\\n");
			String key = lines[0];
			int value = Integer.parseInt(lines[1]);
			
			name.put(key,value);
			if (value > bestvalue) {
				 bestvalue = value;
				 bestplayer = key;
			 }
		}
		//System.out.println(bestplayer);	
		int x = name.get("Sachin Tendulkar");
		driver.findElement(By.xpath("//input[@id='inputField1']")).sendKeys(bestplayer);
		driver.findElement(By.xpath("//input[@id='inputField2']")).sendKeys(String.valueOf(x));

	}
	

}
