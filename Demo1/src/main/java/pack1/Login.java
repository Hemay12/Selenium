package pack1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Demo1");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://stage-edge.answerplatform.com/home");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("krina@innovatemr.com");
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("Krina@123");
		driver.findElement(By.xpath("//span[@class='mat-mdc-button-touch-target']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//mat-list-item[@class='mat-mdc-list-item mdc-list-item mat-mdc-list-item-single-line mdc-list-item--with-one-line ng-star-inserted'])[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class=\"theme-default-btn btn-default icon-right mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base ng-star-inserted\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("New_job_automation");
		driver.findElement(By.xpath("//mat-select[@name='selectedCategoryField']")).click();
		driver.findElement(By.xpath("//mat-select[@name='selectedCategoryField']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//mat-select[@name='selectedCategoryField']")).
		//dropdown.selectByIndex(1);
		
		}
	

}
