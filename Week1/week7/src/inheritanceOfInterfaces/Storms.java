package inheritanceOfInterfaces;

public interface Storms {
	
	double PREDICTED_DAMAGE_LEVEL_0 = 1000;
	double PREDICTED_DAMAGE_LEVEL_1 = 5000;
	double PREDICTED_DAMAGE_LEVEL_2 = 100000;
	double PREDICTED_DAMAGE_LEVEL_3 = 500000;
	double PREDICTED_DAMAGE_LEVEL_4 = 1000000;
	int HURRICANE_CUTOFF = 130;
	int TORNADO_CUTOFF = 157;
	int THUNDERSTORM_CUTOFF = 60;
	 
	
	double predictDamageLevel(int windSpeed);


}
