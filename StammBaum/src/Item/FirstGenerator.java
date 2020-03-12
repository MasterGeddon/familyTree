package Item;

import java.util.ArrayList;

public class FirstGenerator {

	public int maxAge = 5;

	public ArrayList<personItem> personsMale = new ArrayList<personItem>();
	public ArrayList<personItem> personsFemale = new ArrayList<personItem>();
	public ArrayList<beziehungsItem> beziehungen = new ArrayList<beziehungsItem>();
	public ArrayList<personItem> sleepingDead = new ArrayList<personItem>();

	public void thisGenerateBeziehungen() {

		ArrayList<personItem> singleMales = new ArrayList<personItem>();
		ArrayList<personItem> singleFemales = new ArrayList<personItem>();

		for (personItem perM : personsMale) {

			if (perM.getPartner() == null) {

				for (personItem perF : personsFemale) {
					if (perF.getPartner() == null) {
						perM.setPartner(perF);
						perF.setPartner(perM);
						beziehungsItem bezi = new beziehungsItem();
						bezi.setFemale(perF);
						bezi.setMale(perM);
						beziehungen.add(bezi);
					}
				}
				if (perM.getPartner() == null) {
					singleMales.add(perM);
				}
			}

		}

		for (personItem perF : personsFemale) {
			if (perF.getPartner() == null) {
				singleFemales.add(perF);
			}
		}

		personsMale = singleMales;
		personsFemale = singleFemales;

	}

	public ArrayList<personItem> agePeople(ArrayList<personItem> item) {
		ArrayList<personItem> alive = new ArrayList<personItem>();

		for (personItem per : item) {
			per.addAlive();
			if (per.getAlive() < maxAge) {
				alive.add(per);
			} else {
				sleepingDead.add(per);
			}
		}
		return alive;
	}

	public ArrayList<beziehungsItem> ageBeziehung(ArrayList<beziehungsItem> item) {
		ArrayList<beziehungsItem> alive = new ArrayList<beziehungsItem>();
		for (beziehungsItem bezi : item) {
			int flagM = 1;
			int flagF = 1;
			bezi.getMale().addAlive();
			bezi.getFemale().addAlive();
			if (bezi.getMale().getAlive() < maxAge) {

			} else {
				sleepingDead.add(bezi.getMale());
				bezi.setMale(null);
				flagM = 0;
			}
			if (bezi.getFemale().getAlive() < maxAge) {
				
			}else {
				sleepingDead.add(bezi.getFemale());
				bezi.setFemale(null);
				flagF=0;
			}
			if (flagM == 0 && flagF != 0) {
				bezi.getFemale().setPartner(null);
				personsFemale.add(bezi.getFemale());
			} else if (flagM != 0 && flagF == 0) {
				bezi.getMale().setPartner(null);
				personsMale.add(bezi.getMale());
			} else {
				alive.add(bezi);
			}
		}
		return alive;
	}
	
	public void makePeople(beziehungsItem bezi) {
		
		personItem fem = bezi.getFemale();
		personItem mal = bezi.getMale();
		
		
		
	}
	
	public String evaluteStats(personItem fem , personItem mal) {
		
		mal.getStats().getLuck();
		fem.getStats().getLuck();
		
		
		
		return "";
	}


	public void thisGenerateAGeneration() {
		
		agePeople(personsMale);
		agePeople(personsFemale);
		ageBeziehung(beziehungen);
		thisGenerateBeziehungen();
		

	}

}
