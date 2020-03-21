import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/Facebook-Project/");
		driver.findElement(By.id("firstname")).sendKeys("Udita");
		driver.findElement(By.id("surname")).sendKeys("Gupta");
		driver.findElement(By.id("phone_email")).sendKeys("udita1999gupta@gmail.com");
		driver.findElement(By.id("newpassword")).sendKeys("udita1234");
		driver.findElement(By.id("birthday")).sendKeys("1");
		driver.findElement(By.id("birthmonth")).sendKeys("NOV");
		driver.findElement(By.id("birthyear")).sendKeys("1999");
		driver.findElement(By.id("gender_female")).click();
		driver.findElement(By.id("signup")).click();
	}

}
