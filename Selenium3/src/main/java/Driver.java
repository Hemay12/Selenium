import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath(("//textarea[@id='APjFqb']"))).sendKeys("Cars");
		
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']  //input[@class='gNO89b']")).click();
		
		boolean searchResult = false;
		try {
			WebElement exist = driver.findElement(By.xpath("//a[@aria-label='Page 2']"));
			searchResult = true;
			
		} catch (NoSuchElementException e){
			searchResult = false;
		}
		
		if(searchResult) {
			System.out.println("Search element found");
		}else {
			System.out.println("Search element not found");
		}


	}

} 
