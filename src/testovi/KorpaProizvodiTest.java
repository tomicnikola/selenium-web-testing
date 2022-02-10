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

public class KorpaProizvodiTest {
	
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
	public void korpaProizvodiTest() throws InterruptedException {
		driver.get("https://lindex.rs/");
	    driver.manage().window().setSize(new Dimension(1117, 1040));
	    driver.findElement(By.cssSelector(".my-account:nth-child(3) > .porto-icon-user-2")).click();
	    driver.findElement(By.id("username")).click();
	    driver.findElement(By.id("username")).sendKeys("loptica123456789@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("Testseminarski12#");
	    driver.findElement(By.name("login")).click();

	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.linkText("Žene")).click();
	    driver.findElement(By.cssSelector(".product-col:nth-child(1) .hover-image")).click();
	    driver.findElement(By.linkText("Light Dusty Blue")).click();
	    driver.findElement(By.linkText("S")).click();
	    driver.findElement(By.cssSelector(".single_add_to_cart_button")).click();
	    {
	      WebElement element = driver.findElement(By.linkText("Veš"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.linkText("Veš")).click();
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".product-col:nth-child(1) .hover-image")).click();
	    driver.findElement(By.linkText("Dark dusty blue")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(2) .reset_variations"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.linkText("XS")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".single_add_to_cart_button"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.cssSelector(".single_add_to_cart_button")).click();
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.linkText("Deca")).click();
	    driver.findElement(By.cssSelector(".product-col:nth-child(2) .hover-image")).click();
	    driver.findElement(By.linkText("Light Beige")).click();
	    driver.findElement(By.linkText("U")).click();
	    driver.findElement(By.cssSelector(".single_add_to_cart_button")).click();
	    driver.get("https://lindex.rs/korpa/");
	    //driver.findElement(By.linkText("PREGLED KORPE")).click();
	    assertEquals(driver.findElement(By.linkText("Haljina - Sleeveless turtle neck dress - Light Dusty Blue, S")).getText(), "Haljina - Sleeveless turtle neck dress - Light Dusty Blue, S");
	    assertEquals(driver.findElement(By.linkText("Pidzama gornji deo - Long sleeve pyjama top - Dark dusty blue, XS")).getText(), "Pidzama gornji deo - Long sleeve pyjama top - Dark dusty blue, XS");
	    assertEquals(driver.findElement(By.linkText("Ranac - Canvas backpack with Moomin print - Light Beige, U")).getText(), "Ranac - Canvas backpack with Moomin print - Light Beige, U");
	    driver.close();
	  }

}
