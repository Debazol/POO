package cartes;

/**
 * @author gbk
 *
 */
public abstract class Probleme extends Carte {
	private Type type;

	protected Probleme(Type type) {
		this.type = type;
	}

	public Type getType() {
		return type;
	}

	/*
	 * public String toString() { return getType()+""; }
	 */
}
