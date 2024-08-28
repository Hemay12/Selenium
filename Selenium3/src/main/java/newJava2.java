import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class newJava2 {

    public static void main(String[] args) throws InterruptedException {
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Array of jobGroupId and anotherId pairs
        String[][] idPairs = {
        		
        		{"10920308","10162708"},


              // Add all 600 pairs here
            // {"jobGroupId", "anotherId"},
        };

        // Navigate to the login page and perform login
        driver.get("https://edge.innovatemr.net/login");
        driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("hemay@innovatemr.com");
        driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("Hemay@123");
        driver.findElement(By.xpath("//span[@class='mat-mdc-button-touch-target']")).click();

        // Wait for the login to complete and session to establish
        Thread.sleep(5000);
        // Capture the session cookies after login
        Set<Cookie> cookies = driver.manage().getCookies();

        // Iterate through each pair
        for (String[] idPair : idPairs) {
            String jobGroupId = idPair[0];
            String anotherId = idPair[1];

            // Construct the dynamic URL
            String dynamicURL = "https://edge.innovatemr.net/jobs/jobgroups/" + jobGroupId + "/" + anotherId + "/promote/apisupplier";

            // Navigate to the dynamic URL
            driver.get(dynamicURL);
            
            Thread.sleep(8000);
            driver.findElement(By.xpath("//form[@name='sampleNtwkForm']//button[@class='theme-default-btn black-button mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base']//span[@class='mat-mdc-button-touch-target']")).click();
            
          //button[@class='theme-default-btn black-button mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base cdk-focused cdk-mouse-focused']//span[@class='mat-mdc-button-touch-target']
          //button[@class='theme-default-btn black-button mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base cdk-focused cdk-mouse-focused']//span[@class='mat-mdc-button-touch-target']
            // Reapply all cookies to maintain the session
            
            for (Cookie cookie : cookies) {
                driver.manage().addCookie(cookie);
            }

            // Refresh the page after adding cookies to ensure session is active
            //driver.navigate().refresh();

            // Optional: Add a delay to observe actions
            Thread.sleep(8000);

            // Optional: Log the URL
            System.out.println("Navigated to: " + dynamicURL);
        }

        // Close the browser
        driver.quit();
    }
}
