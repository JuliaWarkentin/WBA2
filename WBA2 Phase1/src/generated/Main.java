package generated;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Main {

	 public static void main(String[] args) throws JAXBException {
		 
		 Scanner in = new Scanner(System.in);
		    // Package
		    JAXBContext jc = JAXBContext.newInstance("generated");
		    Unmarshaller unmarshaller = jc.createUnmarshaller();

		    Rezepte sp = (Rezepte) unmarshaller.unmarshal(new File("C://Users/Jusch/git/WBA2/WBA2 Phase1/src/Aufgabe3d.xml"));
		    
		    menue(in,sp,jc);
		    
    }
	 
	 private static void menue(Scanner in, Rezepte re, JAXBContext jc) throws JAXBException {
		// TODO Auto-generated method stub
			int maxRezeptAnz = re.getRezept().size();
			System.out.println("Hauptmenue. Bitte waehlen Sie eine der folgenden Optionen:");
			System.out.println("1: Rezept auswaehlen.");
			System.out.println("2: Kommentar verfassen.");
			System.out.println("3: Schliessen.");
			System.out.printf("Ihre Wahl: ");
			int auswahl = in.nextInt();
			
			if (auswahl == 3) return;
			//Rezeptabfrage
			else {
				System.out.printf("Bitte Rezept durch Eingabe der Nummer waehlen: ");
				int gewaehltesRezept = in.nextInt();
				
				if (gewaehltesRezept > maxRezeptAnz || gewaehltesRezept < 1) {
					System.out.println("Bitte geben Sie eine kleinere Rezeptnummer ein.\n");
					menue(in, re, jc);
				} else {
					Rezept r = re.getRezept().get(0);
					for(int i = 0; i < maxRezeptAnz; i++) {
						if ((i+1) == gewaehltesRezept) {
							r = re.getRezept().get(i);
							
							//Funktionsaufruf nach gewÃ¤hlter Nummer
							switch (auswahl) {
							case 1: ausgabe(in, re, jc, r); break;
							case 2: kommentieren(r, in, re, jc); break;
							default: System.out.printf("Nochmal versuchen."); menue(in, re, jc); break;
							}
						}
						System.out.println("\n");					
					}
				}
			}
		}
		 
		 
	

	public static void ausgabe(Scanner in, Rezepte re, JAXBContext jc, Rezept r) {
		 
		 //Rezeptname
		   System.out.printf("Rezeptname: %s%n%n", r.getRezeptname().rezeptname1);
		   
		   //Zutaten
		   System.out.printf("Zutaten:%n");
		   for(Zutat z : r.zutat)
			   System.out.println(z.getMenge() + " " + z.getEinheit() + " " + z.getName());
		   
		   //Zusätzliche Information
		   	System.out.println("%nZubereitungszeit: " + r.zubereitung.arbeitszeit);
		   	System.out.println("%nSchwierigkeitsgrad: " + r.zubereitung.schwierigkeitsgrad);
		   	System.out.println("%nZubereitung: " + r.zubereitung.brennwertpp);
		   
		   //Zubereitung
		   	System.out.println("\nZubereitung: " + r.getZubereitung().zubereitungstext);
		   
		   //Kommentare
		  	System.out.println("\nKommentare: ");
		   	List<Kommentar> kommentare = r.getKommentar();
		   	if (kommentare==null)
		   		System.out.println("Zur Zeit gibt es keine Kommentare zu diesem Rezept");
		   	else {
		   		for (Kommentar c : r.kommentar) {
		   			System.out.println("Von " + c.user+" am " + c.datum + c.zeit);
		   			System.out.println(c.kommentartext + "\n");
		   		}
		   	}
		   	System.out.println("--------------------------------------------------------------------------------------------------------------------");
	 }
	
	//Kommentar hinzufuegen
		public static void kommentieren(Rezept r, Scanner in, Rezepte re, JAXBContext jc) throws JAXBException {
			if (r.kommentar.isEmpty()) {
				List<Kommentar> comments = new ArrayList<Kommentar>();
				r.kommentar = comments;
			}
			//Daten einlesen
			System.out.printf("Ihr Name: ");
			String author = in.next();
			in.nextLine();
			System.out.printf("Ihr Kommentar: ");
			String message = in.nextLine();
			
			//Daten einfuegen
			Kommentar c = new Kommentar();
			c.setUser(author);
			c.setKommentartext(message);
			
			r.kommentar.add(c);
			
			//marshalling, Speicherung in XML
		    Marshaller ma = jc.createMarshaller();
		    ma.marshal(r, new File("C://Users/Jusch/git/WBA2/WBA2 Phase1/src/Aufgabe3d.xml"));	    
		}
	 
}
