package inheritanceOfInterfaces;

public class StormWarningTwo {
	
	//instance variables
		private Storms stormType;
		private int windSpeedInMPH;
		
		//constructor
		public StormWarningTwo(Storms storm, int speed) {
			stormType = storm;
			windSpeedInMPH = speed;
		}
		
		//other methodsinheritanceOfInterfaces
		public double predictDamageLevel() {
			double damageLevel = stormType.predictDamageLevel(windSpeedInMPH);
			 
			return damageLevel;
		}
		
		//toString
		public String toString() {
			return "The " + stormType + " with wind speeds of " + windSpeedInMPH + "MPH may have damages of " + predictDamageLevel();
		}
		 
		public static void main(String[] args) {
			//Test StormWarning
			StormWarningTwo hurricane = new StormWarningTwo(new Hurricane(), 120);
			StormWarningTwo tornado = new StormWarningTwo(new Tornado(), 300);
			StormWarningTwo thunderstorm = new StormWarningTwo(new ThunderStorm(), 60);
			
			System.out.println(hurricane + "\n" + tornado + "\n" + thunderstorm);
			Waves ellie = new Hurricane();
			System.out.println("Wave height " + ellie.calculateWaveHeight(120, 5));
			

		}


}
