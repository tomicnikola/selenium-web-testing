package testovi;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NeuspelaPrijavaTest {
	private WebDriver driver;
	private JavascriptExecutor js;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikola\\Desktop\\Testiranje softvera\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	  public void neuspelaPrijavaTest() {
	    driver.get("https://lindex.rs/");
	    driver.manage().window().setSize(new Dimension(1117, 1040));
	    driver.findElement(By.cssSelector(".my-account:nth-child(3) > .porto-icon-user-2")).click();
	    driver.findElement(By.id("username")).click();
	    driver.findElement(By.id("username")).sendKeys("loptica123456789@gmail.com");
	    driver.findElement(By.cssSelector(".woocommerce")).click();
	    driver.findElement(By.id("password")).sendKeys("pogresnalozinka");
	    driver.findElement(By.name("login")).click();
	    assertEquals(driver.findElement(By.cssSelector(".woocommerce-error > li")).getText(), "ERROR: The username or password you entered is incorrect. Lost your password?");
	    driver.close();
	  }

}
