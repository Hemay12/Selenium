package Beginner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebPageTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Beginner/B-1.11-PageTitle.html");
		String title = driver.getTitle();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(title);
		
		WebElement x =driver.findElement(By.xpath("//div[@id='successMessage']"));
		String y = x.getText();
		if(y.equals("Success! The title matches.")) {
			System.out.println("Sucess");
		}
		else {
			System.out.println("Failed");
		}

	}

}
