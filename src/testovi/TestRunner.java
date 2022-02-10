package testovi;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {

	public static void main(String[] args) throws IOException {
		Logger log = Logger.getLogger(TestRunner.class.toString());
        
        File f1 = new File("D:\\test-report.txt");
        FileWriter fw = new FileWriter(f1);
        PrintWriter pw = new PrintWriter(fw);
        
        Result registracija = JUnitCore.runClasses(RegistracijaTest.class);
        Result prijava = JUnitCore.runClasses(PrijavaTest.class);
        Result proveraPodataka = JUnitCore.runClasses(ProveraPodataka.class);
        Result neuspelaPrijava = JUnitCore.runClasses(NeuspelaPrijavaTest.class);
        Result podaciKompanije = JUnitCore.runClasses(PodaciKompanijeTest.class);
        Result pretraga = JUnitCore.runClasses(PretragaTest.class);
        Result listaZelja = JUnitCore.runClasses(ListaZeljaTest.class);
        Result korpaProizvodi = JUnitCore.runClasses(KorpaProizvodiTest.class);
        Result korpaCena = JUnitCore.runClasses(KorpaCenaProizvodaTest.class);
        
        if(registracija.wasSuccessful()) {
            log.info("RegistracijaTest je uspesno prosao!");
            pw.println("Naziv testa: RegistracijaTest");
            pw.println("Prolaznost testa: uspesno prosao");
            pw.println("Opis testa: Test RegistracijaTest proverava da li se korisnik uspesno registrovao."
                    + " Ukoliko izbaci gresku da korisnik sa tim emailom vec postoji"
                    + " test je uspesan");
            
        }
        if(prijava.wasSuccessful()) {
            log.info("PrijavaTest je uspesno prosao!");
            pw.println("Naziv testa: PrijavaTest");
            pw.println("Prolaznost testa: uspesno prosao");
            pw.println("Opis testa: Test PrijavaTest proverava da li se korisnik uspesno prijavio"
                    + " sa unetim podacima, ukoliko jeste bice preusmeran na profilnu stranu i "
                    + " test ce biti uspesan.");
            
        }
        if(proveraPodataka.wasSuccessful()) {
            log.info("ProveraPodatakaTest je uspesno prosao!");
            pw.println("Naziv testa: ProveraPodatakaTest");
            pw.println("Prolaznost testa: uspesno prosao");
            pw.println("Opis testa: Test ProveraPodatakaTest proverava da li se podaci pri registraciji"
                    + " podudaraju sa podacima na profilu, ukoliko se podudaraju"
                    + " test ce biti uspesan.");
            
        }
        if(neuspelaPrijava.wasSuccessful()) {
            log.info("NeuspelaPrijavaTest je uspesno prosao!");
            pw.println("Naziv testa: NeuspelaPrijavaTest");
            pw.println("Prolaznost testa: uspesno prosao");
            pw.println("Opis testa: Test NeuspelaPrijavaTest proverava da li se korisnik nije uspesno registrovao."
                    + " Ukoliko nije, izbacice gresku i"
                    + " test ce biti uspesan");
            
        }
        if(podaciKompanije.wasSuccessful()) {
            log.info("PodaciKompanijeTest je uspesno prosao!");
            pw.println("Naziv testa: PodaciKompanijeTest");
            pw.println("Prolaznost testa: uspesno prosao");
            pw.println("Opis testa: Test PodaciKompanijeTest ispisuje podatke o kompaniji");
            
        }
        if(pretraga.wasSuccessful()) {
            log.info("PretragaTest je uspesno prosao!");
            pw.println("Naziv testa: PretragaTest");
            pw.println("Prolaznost testa: uspesno prosao");
            pw.println("Opis testa: Test PretragaTest ispisuje podatke o proizvoda na osnovu unetih podatak u pretrazi");
            
        }
        if(listaZelja.wasSuccessful()) {
            log.info("ListaZeljaTest je uspesno prosao!");
            pw.println("Naziv testa: ListaZeljaTest");
            pw.println("Prolaznost testa: uspesno prosao");
            pw.println("Opis testa: Test ListaZeljaTest vrsi dodavanje proizvoda u listu zelja");
            
        }
        if(korpaProizvodi.wasSuccessful()) {
            log.info("KorpaProizvodiTest je uspesno prosao!");
            pw.println("Naziv testa: KorpaProizvodiTest");
            pw.println("Prolaznost testa: uspesno prosao");
            pw.println("Opis testa: Test KorpaProizvodiTest vrsi dodavanje 3 proizvoda u korpu");
            
        }
        if(korpaCena.wasSuccessful()) {
            log.info("KorpaCenaProizvodaTest je uspesno prosao!");
            pw.println("Naziv testa: KorpaCenaProizvodaTest");
            pw.println("Prolaznost testa: uspesno prosao");
            pw.println("Opis testa: Test KorpaCenaProizvodaTest vrsi proveru ukupne cene proizvoda u korpi");
            
        }
        
        pw.close();
	}

}
