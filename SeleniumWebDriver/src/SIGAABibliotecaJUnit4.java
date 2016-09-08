import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SIGAABibliotecaJUnit4 {

	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://sigaa.ufrn.br/sigaa/public/biblioteca/buscaPublicaAcervo.jsf?aba=p-biblioteca";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testSIGAABibliotecaJUnit4() throws Exception {
		driver.get(baseUrl
				+ "/sigaa/public/biblioteca/buscaPublicaAcervo.jsf?aba=p-biblioteca");
		driver.findElement(By.name("formBuscaPublica:j_id_jsp_929783349_43"))
				.clear();
		driver.findElement(By.name("formBuscaPublica:j_id_jsp_929783349_43"))
				.sendKeys("Kent Beck");
		driver.findElement(By.id("formBuscaPublica:checkAutor")).click();
		driver.findElement(By.id("formBuscaPublica:checkAutor")).click();
		driver.findElement(By.id("formBuscaPublica:botaoPesquisarPublicaMulti"))
				.click();
		assertEquals(
				"SIGAA - Sistema Integrado de Gestão de Atividades Acadêmicas",
				driver.getTitle());
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}

	public static void main(String[] args) throws Exception {
		SIGAABibliotecaJUnit4 S = new SIGAABibliotecaJUnit4();
		System.setProperty("webdriver.gecko.driver",
				"/home/andersonpablo/Downloads/geckodriver");


	}

}