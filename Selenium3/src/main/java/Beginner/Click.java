package Beginner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://softwaretestingpro.github.io/Automation/Beginner/B-1.01-Click.html");
		driver.findElement(By.xpath("//button[@id='clickButton']")).click();
		
		WebElement successMessage = driver.findElement(By.xpath("//div[@id='successMessage']"));
		String text = successMessage.getText();
		if(text.equals("Success! You clicked the button.")) {
			System.out.println("Click successfull");
		}
		else {
			System.out.println("Click not successfull");
		}

	}

}
