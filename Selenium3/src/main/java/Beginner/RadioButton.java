package Beginner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://softwaretestingpro.github.io/Automation/Beginner/B-1.03-Radio.html");
		driver.findElement(By.xpath("//input[@value='male']")).click();
		WebElement successmessage = driver.findElement(By.xpath("//div[@class='success-message']"));
		String not = successmessage.getText();
		if(not.equals("You have selected Male.")) {
			System.out.println("Male radio selected successfully");
		}
		else {
			System.out.println("Not selected properly");
		}
	}

}
