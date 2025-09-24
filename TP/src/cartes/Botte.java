package cartes;

public class Botte extends Probleme {
	private Type type;
	
	public Botte(Type type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return type.getBotte();	
	}
}
