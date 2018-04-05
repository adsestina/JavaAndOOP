package inheritanceOfInterfaces;

public class Tornado implements Storms {
	
	public double predictDamageLevel(int windSpeed) {
		double damageLevel = 0;
		 
		if (windSpeed <= TORNADO_CUTOFF) {
			damageLevel = PREDICTED_DAMAGE_LEVEL_2;
		} else {
			damageLevel = PREDICTED_DAMAGE_LEVEL_3;
		}
		
		return damageLevel;
	}
	
	public String toString() {
		return "tornado";
	}


}
