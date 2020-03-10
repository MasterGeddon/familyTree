package Item;

public class personItem {

	public int id;
	public int generation ; 


	public String name ;
	
	public Stats stats ;
	
	public int Gender = 1 ; 
	
	public String parentIDMale ="FIRST";
	public String parentIDFemale ="FIRST";
	
	public int alive = 0;
	
	public personItem partner ;
	
	
	public personItem () {
		
		stats = new Stats();
		id = (int)Math.random()*50;
		generation = 1;
		genGender ();
		
	}
	
	public personItem(String pM , String pF , int gen, String Stats) {
		parentIDMale = pM;
		parentIDFemale = pF;
		generation = gen;
		stats = new Stats(Stats);
		genGender ();
	}
	
	
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
