
public class Redioactivity {
	

	    public static double calculateRemainingMass(double initialMass, int halfLives) {
	       return initialMass * Math.pow(0.5, halfLives);
	    }

	    public static double calculateDecayTime(int halfLifeTime, int halfLives) {
	       return halfLifeTime * halfLives;
	    }

	    public static void main(String[] args) {
	       double initialMass = 100.0; 
	        int halfLifeTime = 5; 
	        int halfLives = 3; 

	        double remainingMass = calculateRemainingMass(initialMass, halfLives);
	        double totalTime = calculateDecayTime(halfLifeTime, halfLives);

	        System.out.println("Remaining mass of material: " + remainingMass + " grams");
	        System.out.println("Total time for the material to decay: " + totalTime + " years");
	    }
	}
