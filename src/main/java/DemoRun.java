import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRun {
public static void main(String... ar)
	{
			System.setProperty("webdriver.chrome.driver", "/home/rajesh/eclipse-workspace/Selenium_JavaAutomation/drivers/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://google.com");
			driver.manage().window().maximize();
			System.out.println("The title is "+driver.getTitle());
			driver.quit();
	}
}
