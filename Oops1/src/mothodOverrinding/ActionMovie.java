package mothodOverrinding;

public class ActionMovie extends Movie {
	public String fightSecount(int fight) {
		if(fight==3) {
			return "blow movie";
		}else if(fight==4) {
			return "average movie";
		}else if(fight==5){
			return "okay movie";
		}else if(fight==6) {
			return"good movie";
		}else {
			return"Invalid data";
		}
	}
	

}
