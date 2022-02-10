package testovi;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

public class PodaciKompanijeTest {
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
	 public void podaciKompanijeTest() throws IOException {
	    driver.get("https://lindex.rs/");
	    driver.manage().window().setSize(new Dimension(1117, 1040));
	    driver.findElement(By.linkText("O nama")).click();
	    
	    WebElement podaciKompanije = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/div[2]/article/div/div/div/div/div"));
	    String tekst = podaciKompanije.getText();
	    
	    
	    File f1 = new File("D:\\podaci-report.txt");
        FileWriter fw = new FileWriter(f1);
        PrintWriter pw = new PrintWriter(fw);
        
        pw.println(tekst);
        pw.close();
        
        driver.close();

	    
	}
	

}
