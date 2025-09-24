package cartes;

public enum Type {
	FEU("Rouge","Vert","Prioritaire"),
	Essence("essence","panne","citerne"),
	Crevaison("crevaison","roue de secours","increvable"),
	Accident("Accident","Reparation","As du volant");
	
	private final String att;
	private final String parade;
	private final String botte;
	
	private Type(String att,String parade, String botte) {
		this.att=att;
		this.parade=parade;
		this.botte=botte;
	}
	
	public String getAtt() {
		return att;
	}

	public String getParade() {
		return parade;
	}

	public String getBotte() {
		return botte;
	}

}
