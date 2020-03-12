package Item;

//  stellt eine person da 

public class personItem {

	// id der person , 
	public int id;
	// generation in welcher die person geboren wurde
	public int generation ; 

	// name der person
	public String name ;
	
	// stats object der person
	public Stats stats ;
	
	// geschlecht der person 
	public int Gender = 1 ; 
	
	// id der eltern ist ein string mit stats id und generation
	public String parentIDMale ="FIRST";
	// für beide
	public String parentIDFemale ="FIRST";
	
	// wie lange er schon lebt , abgewissen alter sind sie geschlechtsreif , ab gewissem alter sind sie tot 
	public int alive = 0;
	
	// ihr aktueller partner
	public personItem partner ;
	
	
	// constructor der ersten person 
	public personItem () {
		
		stats = new Stats();
		id = (int)Math.random()*50;
		generation = 1;
		genGender ();
		
	}
	
	// construckter mit eltern und generetion und stats TODO hier muss noch eine id hin vielleicht 
	public personItem(String pM , String pF , int gen, String Stats) {
		parentIDMale = pM;
		parentIDFemale = pF;
		generation = gen;
		stats = new Stats(Stats);
		genGender ();
	}
	
	
	// das geschelcht wird gewürfelt ;)
	public void genGender () {
		Gender = ((int) Math.random()*21)%2;
	}

	public int getGender () {
		return this.Gender;
	}
	
	public int getAlive() {
		return alive;
	}

	public void addAlive() {
		this.alive ++;
	}

	public personItem getPartner() {
		return partner;
	}

	public void setPartner(personItem partner) {
		this.partner = partner;
	}
	
	public Stats getStats() {
		return stats;
	}
	
	public int getGeneration() {
		return generation;
	}
	
	
}
