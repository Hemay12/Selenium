package Beginner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Beginner/B-1.09-DoubleClick.html");
		WebElement dr = driver.findElement(By.xpath("//button[@id='clickButton']"));
		
		Actions ac = new Actions(driver);
		ac.doubleClick(dr).perform();
		
		WebElement x =driver.findElement(By.xpath("//div[@class='success-message']"));
		String y = x.getText();
		if(y.equals("Success! You double-clicked the button.")) {
			System.out.println("Sucess");
		}
		else {
			System.out.println("Failed");
		}
	}

}
