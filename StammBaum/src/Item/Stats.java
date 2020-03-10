package Item;

public class Stats {

	public int Strength, Charisma, Dexterity, Constitution, Inteligence, Wisdom = 10;

	public int Luck = 7;
	public int Sanity = 10;

	public Stats() {
		Strength =generateStats();
		Charisma =generateStats();
		Dexterity =generateStats();
		Constitution =generateStats();
		Inteligence =generateStats();
		Wisdom =generateStats();
	}

	public Stats(String stats) {
		Strength =generateStats(stats,1);
		Charisma =generateStats(stats,2);
		Dexterity =generateStats(stats,3);
		Constitution =generateStats(stats,4);
		Inteligence =generateStats(stats,5);
		Wisdom =generateStats(stats,6);
		
	}

	public int generateStats() {
		return  (int)Math.random()*21;
	}

	public int generateStats(String stats,int part) {
		int temp = 10;
		if(stats.length()%2 ==0) {
			 switch(part){ 
			 case 1:temp =Integer.parseInt(stats.substring(0,2));
			 break;
			 case 2:temp =Integer.parseInt(stats.substring(2,4));
			 break;
			 case 3:temp =Integer.parseInt(stats.substring(4,6));
			 break;
			 case 4:temp =Integer.parseInt(stats.substring(6,8));
			 break;
			 case 5:temp =Integer.parseInt(stats.substring(8,10));
			 break;
			 case 6:temp =Integer.parseInt(stats.substring(10,12));
			 break;
			 default:temp = 10;
			 }
		}
		else if(stats.length()%2 ==1){
			 switch(part){ 
			 case 1:temp =Integer.parseInt(stats.substring(0,1));break;
			 case 2:temp =Integer.parseInt(stats.substring(1,3));break;
			 case 3:temp =Integer.parseInt(stats.substring(3,5));break;
			 case 4:temp =Integer.parseInt(stats.substring(5,7));break;
			 case 5:temp =Integer.parseInt(stats.substring(7,9));break;
			 case 6:temp =Integer.parseInt(stats.substring(9,11));break;
			 default:temp = 10;
			 }
		}
		
		return temp ; 
	}
	
	public String getStats() {
		
		return 	padLeftZeros(""+Strength,2)+
				padLeftZeros(""+Charisma,2)+
				padLeftZeros(""+Dexterity,2)+
				padLeftZeros(""+Constitution,2)+
				padLeftZeros(""+Inteligence,2)+
				padLeftZeros(""+Wisdom,2);
		
	}
	
	public String padLeftZeros(String inputString, int length) {
	    if (inputString.length() >= length) {
	        return inputString;
	    }
	    StringBuilder sb = new StringBuilder();
	    while (sb.length() < length - inputString.length()) {
	        sb.append('0');
	    }
	    sb.append(inputString);
	 
	    return sb.toString();
	}
	
	public void genLuckSan() {
		Luck = (int)Math.random()*21;
		Sanity = (int)Math.random()*21;
	}
	
	
	public int getLuck() {
		return Luck;
	}

	public void decreaseLuck() {
		Luck --;
	}

	public int getSanity() {
		return Sanity;
	}

	public void decreaseSanity() {
		Sanity --;
	}
	public void gainSanity() {
		Sanity ++;
	}
	
}
