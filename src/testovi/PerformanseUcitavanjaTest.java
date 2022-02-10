package testovi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformanseUcitavanjaTest {
public static void main(String[] args) throws IOException {
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        File f1 = new File("D:\\brzinaUcitavanjaStranica.txt");
        FileWriter fw = new FileWriter(f1);
        PrintWriter pw = new PrintWriter(fw);
        
        HashMap<String, String> stranice = new HashMap<>();
        stranice.put("Registracija korisnika", vremeIzvrsavanja("https://lindex.rs/moj-nalog/"));
        stranice.put("Kategorija Zene", vremeIzvrsavanja("https://lindex.rs/kategorija/zene/"));
        stranice.put("Kategorija Ves", vremeIzvrsavanja("https://lindex.rs/kategorija/ves/"));
        stranice.put("Kategorija Dece", vremeIzvrsavanja("https://lindex.rs/kategorija/deca/"));
        stranice.put("Kategorija Bebe", vremeIzvrsavanja("https://lindex.rs/kategorija/deca/bebe/"));

        double sum = 0;

        for (HashMap.Entry<String, String> element : stranice.entrySet()) {
            pw.println(element + " sekunde");
            sum+= Double.parseDouble(element.getValue());
        }
        
        pw.println("Prosecno vreme ucitavanja svih stranica je: " + df.format(sum / stranice.size()) + " sekunde");
        pw.close();
    }

    public static String vremeIzvrsavanja(String url) {
    	
        DecimalFormat df = new DecimalFormat("0.00");   
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikola\\Desktop\\Testiranje softvera\\chromedriver.exe");
        driver = new ChromeDriver();
        
        double start = System.currentTimeMillis();
        driver.get(url);
        double finish = System.currentTimeMillis();
        double total = (finish - start) / 1000;
        driver.quit();
        return df.format(total);

    }
}
