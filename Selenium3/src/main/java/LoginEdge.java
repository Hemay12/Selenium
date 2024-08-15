import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://stage-edge.answerplatform.com/login");
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("hemay@innovatemr.com");
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("Hemay@123");
		driver.findElement(By.xpath("//span[@class='mat-mdc-button-touch-target']")).click();
		
		boolean searchResults = false;
		try {
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			driver.findElement(By.xpath("//input[@id='mat-mdc-chip-list-input-0']"));
			searchResults = true;
		} catch(NoSuchElementException e){
			searchResults = false;
		}
		
		if(searchResults) {
			System.out.println("Login Successfully");
		} else {
			System.out.println("Login failed");
		}
		

	}

}
