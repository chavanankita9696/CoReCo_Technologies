
public class TeamworkTileTactics {

	    public static boolean possibleBonus(int yourTile, int friendTile) {
	        if (yourTile < friendTile && 1 <= (friendTile - yourTile) && (friendTile - yourTile) <= 6) {
	            return true;
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	 
	        System.out.println(possibleBonus(3, 7));  
	        System.out.println(possibleBonus(1, 9)); 
	        System.out.println(possibleBonus(5, 3)); 
	    }
	}

