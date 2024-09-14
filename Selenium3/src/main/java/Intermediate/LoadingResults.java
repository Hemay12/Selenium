package Intermediate;

import java.time.Duration;
import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoadingResults {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/Automation/Intermediate/I-2.17-LoadingResults.html");
			
		 //long endTime = System.currentTimeMillis()+ 10000;
		int maxAttempts = 4;  
        int attempts = 0;
        String arr[] = new String[maxAttempts];
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		 
		 while(attempts < maxAttempts) {
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='thumbnail' and contains(@style,'opacity: 1')]")));
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='isbn']")));
				WebElement wb = driver.findElement(By.xpath("//div[@class='isbn']"));
				String str1 = wb.getText();
				String parts [] = str1.split(":");
				arr[attempts] = parts[1].trim();
				System.out.println(arr[attempts]);
				
			}
			
			catch (Exception e){
				System.out.println("No such Element found");
			}
			if (attempts == maxAttempts) {
                break;
            }
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='thumbnail' and contains(@style,'opacity: 0')]")));
		
			attempts++;
		}
		 
		System.out.println(Arrays.toString(arr));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-0']")));
		
		driver.findElement(By.xpath("//input[@id='input-0']")).sendKeys(arr[0]);
		driver.findElement(By.xpath("//input[@id='input-1']")).sendKeys(arr[1]);
		driver.findElement(By.xpath("//input[@id='input-2']")).sendKeys(arr[2]);
		driver.findElement(By.xpath("//input[@id='input-3']")).sendKeys(arr[3]);
		
	}

}
