package Pack;

import org.jboss.netty.util.internal.SystemPropertyUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Automation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://cse16.ml/user_login.php");
		
		WebElement textUsername=driver.findElement(By.id("student_id"));
		textUsername.sendKeys("160110t");
		

		//WebElement textPassword=driver.findElement(By.id("pass"));
		//textPassword.sendKeys("unidemo@123");
		

		WebElement btnLogin=driver.findElement(By.className("btn btn-primary form-control"));
		btnLogin.click();
		
		/*String username=driver.findElement(By.className("_1vp5")).getText();
		//System.out.println(username);
		
		//if(username.equals("Uni")) {
			System.out.println("Pass");
		//}
		else {
			System.out.println("Fail");
		}*/
	}

}
