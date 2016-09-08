import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testeSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"/home/andersonpablo/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
		;
		driver.get("http://www.google.com");
		
		if (driver.findElement(By.xpath("//input[@name='q']")).isEnabled()) {
			System.out.println("Google Pesquisa na caixa de texto está ativada.");
			
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys(
					"Sigaa UFRN.");
			
			driver.findElement(By.xpath("//button[@name='btnG']")).click();
			System.out.println("Google pesquisa completado.");
			
		} else {
			System.out.println("caixa de pesquisa de texto Google não está habilitado.");

		}
		driver.close();
	}
}