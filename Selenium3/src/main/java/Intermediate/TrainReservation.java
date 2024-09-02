package Intermediate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrainReservation {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://softwaretestingpro.github.io/Automation/Intermediate/I-2.03-Train.html");

        String bestStatus = null;
        int bestValue = -1;
        WebElement bestRadioButton = null;

        Map<String, Integer> priority = new HashMap<>();
        priority.put("Available", 1);
        priority.put("RAC", 2);
        priority.put("Waiting", 3);      

        List<WebElement> radiobuttons = driver.findElements(By.xpath("//input[@type='radio']"));

        for (WebElement radio : radiobuttons) {
            WebElement parentRow = radio.findElement(By.xpath("./ancestor::tr"));
            WebElement targetTd = parentRow.findElement(By.xpath("./td[4]"));
            String str = targetTd.getText();
            System.out.println(str);

            String[] parts = str.split(":");
            String status = parts[0].trim();
            int value = Integer.parseInt(parts[1].trim());

            if (bestStatus == null ||
                priority.get(status) < priority.get(bestStatus) ||
                (priority.get(status).equals(priority.get(bestStatus)) && value > bestValue)) {
                
                bestStatus = status;
                bestValue = value;
                bestRadioButton = radio;
            }
        }

        if (bestRadioButton != null) {
            bestRadioButton.click();
        }
        
     
    }
}
