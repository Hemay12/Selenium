import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFile {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Hemay_Sorathiya\\Pictures\\Screenshots\\Screenshot 2024-02-23 121608.png");
		driver.findElement(By.xpath("//input[@class='button']")).click();
		
		WebElement validateFileupload = driver.findElement(By.xpath("//div[@class='example'] //h3"));
		String validateUpload = validateFileupload.getText();
		String a1 = "File Uploaded!";
		
		if(validateUpload.equals(a1)) {
			System.out.println("File Upload successfully");
		}
	}

}
