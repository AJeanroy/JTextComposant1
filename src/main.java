import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ecran mEcran = new Ecran(400, 400,"2017 01 11");
		
		//Input user libre
		String input_user = (String)JOptionPane.showInputDialog(
		"Saisir le nom du client", JOptionPane.PLAIN_MESSAGE);
				
		//Initailisation du tableau des personnes
		Personne[] personnes = new Personne[5];
		personnes[0] = new Personne("Wayne", "John",  new GregorianCalendar(1907, 5, 26));
		personnes[1] = new Personne("McQueen", "Steve", new GregorianCalendar(1930, 3, 25));
		personnes[2] = new Personne("Lennon", "John", new GregorianCalendar(1940, 10, 9));
		personnes[3] = new Personne("Gibson", "Mel", new GregorianCalendar(1956, 1, 3));
		personnes[4] = new Personne("Willis", "Bruce", new GregorianCalendar(1955, 3, 1900));		
				
		//Affichage du résultat
		JOptionPane.showInputDialog(mEcran.GetPanel(), "Selectionnez le client", "Recherche de client", JOptionPane.WARNING_MESSAGE, null, personnes, personnes[0].toString());
				
		//Confirmation de fermeture
		mEcran.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int confirm = JOptionPane.showConfirmDialog(null, "Voulez-vous quitter sans enregistrer?", "Fermeture", JOptionPane.YES_NO_OPTION);
				if (confirm == 0) {
					System.exit(0);
				}
			}
		});
		
		mEcran.SetVisible();
	}

}
