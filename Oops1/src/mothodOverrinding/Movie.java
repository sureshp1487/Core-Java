package mothodOverrinding;

public class Movie {
	int fightS=4;
	public String fightSecount(int fight) {
		if(fight==3) {
			return "Averge";
		}else if(fight==4) {
			return "okay";
		}else if(fight==5) {
			return "good movie";
		}else {
			return "invalid data";
		}
		
	}

}
