package Item;

public class beziehungsItem {

	
	// beziehungspartner 1
	public personItem male ;

	// beziehungspartner 2 
	public personItem female ; 
	
	
	public personItem getFemale() {
		return female;
	}
	public void setFemale(personItem female) {
		this.female = female;
	}
	
	public personItem getMale() {
		return male;
	}
	public void setMale(personItem male) {
		this.male = male;
	}
	
	
	
}
