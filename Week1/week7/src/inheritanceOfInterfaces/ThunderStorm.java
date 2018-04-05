package inheritanceOfInterfaces;

public class ThunderStorm implements Storms {
	
	public double predictDamageLevel(int windSpeed) {
		double damageLevel = 0;
		 
		if (windSpeed <= THUNDERSTORM_CUTOFF) {
			damageLevel = PREDICTED_DAMAGE_LEVEL_0;
		} else {
			damageLevel = PREDICTED_DAMAGE_LEVEL_1;
		}
		
		return damageLevel;
	}
	
	public String toString() {
		return "thunderstorm";
	}

}
