package Beginner;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Beginner/B-1.07-RadioList.html");
		List<WebElement> radiobuttons = driver.findElements(By.xpath("//input[@class='form-check-input']"));
		String text = "Success! You selected India. ✅";
		
		
		boolean found = false;
		int i =0;
		
		while(i< radiobuttons.size() && !found) {
			WebElement radio = radiobuttons.get(i);
			radio.click();
			WebElement x = driver.findElement(By.xpath("//div[@id='successMessage']"));
			String y = x.getText();
			
			TimeUnit.MILLISECONDS.sleep(500);
			if(y.equals(text)) {
				System.out.println("Success");
				found = true;
			}
			else {
				System.out.println("Wait. Lets try another");
			}
			i++;
		}
	}

}
