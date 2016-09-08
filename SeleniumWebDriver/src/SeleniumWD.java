import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWD {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"/home/andersonpablo/Downloads/geckodriver");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://google.com");
		driver.close();

	}
}