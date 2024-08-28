package Beginner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputField {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://softwaretestingpro.github.io/Automation/Beginner/B-1.02-Input.html");
		driver.findElement(By.xpath("//input[@id='user-input-name']")).sendKeys("Name");
		driver.findElement(By.xpath("//input[@id='user-input-age']")).sendKeys("22");
		
		WebElement not = driver.findElement(By.xpath("//input[@id='text-input']"));
		String maxlength = not.getAttribute("maxlength"); 
		String pattern = not.getAttribute("pattern");
        String inputType = not.getAttribute("type");
        
		System.out.println("Max Length: " + maxlength);
		System.out.println("Pattern: " + pattern);
        System.out.println("Input Type: " + inputType);
			

	}

}
