import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicRefresh {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/dynamic_content");
		
		WebElement beforeRefresh1 = driver.findElement(By.xpath("//div[@id='content']/div[1]/div[2]"));
		WebElement beforeRefresh2 = driver.findElement(By.xpath("//div[@id='content']/div[2]/div[2]"));
		WebElement beforeRefresh3 = driver.findElement(By.xpath("//div[@id='content']/div[3]/div[2]"));
		
		String b1 = beforeRefresh1.getText();
		String b2 = beforeRefresh2.getText();
		String b3 = beforeRefresh3.getText();
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		driver.navigate().refresh();
		
		WebElement afterRefresh1 = driver.findElement(By.xpath("//div[@id='content']/div[1]/div[2]"));
		WebElement afterRefresh2 = driver.findElement(By.xpath("//div[@id='content']/div[2]/div[2]"));
		WebElement afterRefresh3 = driver.findElement(By.xpath("//div[@id='content']/div[3]/div[2]"));
		
		String a1 = afterRefresh1.getText();
		String a2 = afterRefresh2.getText();
		String a3 = afterRefresh3.getText();
		
		if(!b1.equals(a1)) {
			System.out.println("Content has changed");
		}
		else {
			System.out.println("Content has not changed");
		}
		
		if(!b2.equals(a2)) {
			System.out.println("Content has changed");
		}
		else {
			System.out.println("Content has not changed");
		}
		
		if(!b3.equals(a3)) {
			System.out.println("Content has changed");
		}
		else {
			System.out.println("Content has not changed");
		}
	}

}
