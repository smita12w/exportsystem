abcpackage PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPo {

	
		// TODO Auto-generated method stub
		private WebElement username;
		private WebElement password;

		private WebDriver driver;

		public LoginPo() {
			System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			username = driver.findElement(By.id("txtUsername"));
			password = driver.findElement(By.id("txtPassword"));

		}
		public void login(String userID, String passwd) {
			username.sendKeys(userID);
			password.sendKeys(passwd);
			password.submit();
		}


	}
	


