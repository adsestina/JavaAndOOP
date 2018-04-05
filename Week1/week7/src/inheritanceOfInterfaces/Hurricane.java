package inheritanceOfInterfaces;

public class Hurricane implements Waves {
	

	
	
	public double predictDamageLevel(int windSpeed) {
		double damageLevel = 0;

		if (windSpeed <= HURRICANE_CUTOFF) {
			damageLevel = PREDICTED_DAMAGE_LEVEL_3;
		} else {
			damageLevel = PREDICTED_DAMAGE_LEVEL_4;
		}

		return damageLevel;
	}
	
	public double calculateWaveHeight(int windSpeed, int depth) {
		double height = windSpeed * depth * .25;
		return height;
	}
	
	public String toString() {
		return "hurricane";
	}

	
	

}
