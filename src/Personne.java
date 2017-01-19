import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;

public class Personne {
	
	private String nom;
	private String prenom;
	private GregorianCalendar date_nais;
	
	public Personne() {
		nom = "Bridou";
		prenom = "Justin";
		date_nais = new GregorianCalendar(2005, 02, 9);
	}
	
	public Personne(String n, String pn, GregorianCalendar d) {
		nom = n;
		prenom = pn;
		date_nais = d;
	}
	
	public void affichage(){
		System.out.println("Nom: " + nom);
		System.out.println("Prenom: " + prenom);
		System.out.println("Âge: " + calculAge());
	}
	
	public void affichage (boolean francais) {
		if (francais) {
			System.out.println("Nom: " + nom);
			System.out.println("Prenom: " + prenom);
			System.out.println("Âge: " + calculAge());
		} else {
			System.out.println("Nom: " + nom);
			System.out.println("Prenom: " + prenom);
			System.out.println("Âge: " + calculAge());
		}
	}
	
	public void affichage2 (boolean majuscule) {
		if (majuscule) {
			System.out.println("Nom: " + nom.toUpperCase());
			System.out.println("Prenom: " + prenom.toUpperCase());
			System.out.println("Âge: " + calculAge());
		} else {
			System.out.println("Nom: " + nom.toLowerCase());
			System.out.println("Prenom: " + prenom.toLowerCase());
			System.out.println("Âge: " + calculAge());
		}
	}
	
	public long calculAge() {
		long age;
		
		age = new GregorianCalendar().getTimeInMillis()-date_nais.getTimeInMillis();
		age = age/1000/60/60/24/365;
		return age;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String n) {
		nom = n.toUpperCase();
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String p) {
		nom = p.toUpperCase();
	}
	
	public GregorianCalendar getDate() {
		return date_nais;
	}
	
	public void setDate(LocalDate of) {
		Date utilDate = Date.from(of.atStartOfDay(ZoneId.systemDefault()).toInstant());
		this.date_nais.setTime(utilDate);		
	}
	
	public void setDate(GregorianCalendar d) {
		date_nais = d;
	}
		
	
	public String toString() {
		String temp;
		temp = nom + ", " + prenom + ", " + calculAge();
		return temp;
	}

	
}

