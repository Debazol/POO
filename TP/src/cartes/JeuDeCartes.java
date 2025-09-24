package cartes;

public class JeuDeCartes {
	private Configuration[] tabConfig;
	private int typesDeCartes=19;
	
	public JeuDeCartes() {
		// TODO Auto-generated constructor stub
	}
	
	private static class Configuration extends Carte{
		private int nbExemplaires;
		private Carte carte;
		
		private Configuration(Carte carte, int nbExemplaires) {
			this.nbExemplaires=nbExemplaires;
			this.carte=carte;
			
		}

		public Carte getCarte() {
			return carte;
		}

		public int getNbExemplaires() {
			return nbExemplaires;
		}	
		
		
	}
	
	public Carte[] donnerCartes() {
		
	}
	
	public String affichageJeuDeCartes() {
		
	}
}
