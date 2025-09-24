package jeu;
import java.util.NoSuchElementException;

import cartes.*;

public class Sabot implements Iterable<Carte>{
	private Carte[] cartes;
	private int nbCartes=106;
	private int NbOp=0;


	public Sabot(Carte[] cartes, int nbCartes) {
		super();
		this.cartes = cartes;
		//this.nbCartes = nbCartes;
	}
	
	public boolean estVide() {
		return nbCartes==106;
	}
	
	public void ajouterCarte(Carte carte) {
		if(nbCartes<106) {
			cartes[nbCartes]=carte;
			nbCartes++;
		}
		else {throw new NoSuchElementException();}
	}
	
	public Iterator<Carte> iterateur(){
		return new Iterateur();
	}
	
	private class Iterateur implements Iterator<Carte>{
		private int indiceIterateur=0;
		private boolean nextEffectue=false;
		private int NbOpRef=NbOp;
		
		
		
		
	}

}
