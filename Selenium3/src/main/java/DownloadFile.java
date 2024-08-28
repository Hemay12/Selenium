import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadFile {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String downloadFilePath = "C:\\path\\to\\download\\directory";
		
		driver.get("https://the-internet.herokuapp.com/download");
		WebElement download = driver.findElement(By.linkText("some-file.txt"));
		download.click();
	}

}
