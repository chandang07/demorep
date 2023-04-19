
package hallolli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.oge.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='iconMobileProfile']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='round input-mb input-border']")).sendKeys("hallolk@oge.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rcbrcb@escn");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
		
	}
}
