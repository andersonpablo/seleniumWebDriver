import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class testPag {
	
	public static void main(String[] args) {

	System.setProperty("webdriver.gecko.driver", "/home/andersonpablo/Downloads/geckodriver");
	WebDriver f = new FirefoxDriver();
	String url = "http://www.fb.com"; 
	f.get(url);
	f.close();
	
	}
}
