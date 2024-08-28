package Beginner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CopyText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Beginner/B-1.06-ValueInput.html");
		WebElement copy = driver.findElement(By.xpath("(//input[@id='inputField1'])[1]"));
//		copy.click();
//		Actions ac = new Actions(driver);
//		ac.doubleClick(copy);
		String c1 = copy.getText();
		System.out.println(c1);
	}

}
