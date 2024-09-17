package Advanced;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisappearingElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Advanced/A-3.01-HiddenElement.html");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement x  = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='showButton']")));;
		x.click();
	}

}
