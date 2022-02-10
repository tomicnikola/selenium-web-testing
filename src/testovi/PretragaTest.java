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

public class PretragaTest {
	
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
	  public void pretragaTest() {
	    driver.get("https://lindex.rs/");
	    driver.manage().window().setSize(new Dimension(1117, 1040));
	    {
	      WebElement element = driver.findElement(By.cssSelector(".my-account:nth-child(3) > .porto-icon-user-2"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.cssSelector(".my-account:nth-child(3) > .porto-icon-user-2")).click();
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.id("username")).click();
	    driver.findElement(By.id("username")).sendKeys("loptica123456789@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("Testseminarski12#");
	    driver.findElement(By.name("login")).click();
	    driver.findElement(By.cssSelector(".search-toggle > .fas")).click();
	    driver.findElement(By.id("yith-s")).sendKeys("Haljina - Sleeveless");
	    driver.findElement(By.cssSelector(".searchform-popup > #yith-ajaxsearchform .fas")).click();
	    assertEquals(driver.findElement(By.cssSelector(".post-202156 .woocommerce-loop-product__title")).getText(), "Haljina – Sleeveless turtle neck dress");
	    assertEquals(driver.findElement(By.cssSelector(".post-171604 .woocommerce-loop-product__title")).getText(), "Haljina – Sleeveless v-neck dress");
	    assertEquals(driver.findElement(By.cssSelector(".post-169954 .woocommerce-loop-product__title")).getText(), "Haljina – Sleeveless knitted dress");
	    assertEquals(driver.findElement(By.cssSelector(".post-167935 .woocommerce-loop-product__title")).getText(), "Haljina – Sleeveless hoodie dress");
	    driver.close();
	  }

}
