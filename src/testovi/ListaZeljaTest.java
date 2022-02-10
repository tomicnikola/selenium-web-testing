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

public class ListaZeljaTest {
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
	  public void listaZeljaTest() {
		driver.get("https://lindex.rs/");
	    driver.manage().window().setSize(new Dimension(1117, 1040));
	    driver.findElement(By.cssSelector(".my-account:nth-child(3) > .porto-icon-user-2")).click();
	    driver.findElement(By.id("username")).click();
	    driver.findElement(By.id("username")).sendKeys("loptica123456789@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("Testseminarski12#");
	    driver.findElement(By.name("login")).click();
	    driver.findElement(By.linkText("Žene")).click();
	    driver.findElement(By.cssSelector(".product-col:nth-child(1) .hover-image")).click();
	    driver.findElement(By.cssSelector(".add-to-wishlist-202156 .add_to_wishlist")).click();
	    driver.get("https://lindex.rs/wishlist/");
	    assertEquals(driver.findElement(By.linkText("Haljina - Sleeveless turtle neck dress")).getText(), "Haljina - Sleeveless turtle neck dress");
	    driver.close();
	  }

}
