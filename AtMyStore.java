
public class AtMyStore {
		    public static String canPurchase(int[] notes, int price) {
	      
	        int[] noteValues = {10, 50, 100, 200};

	      
	        int totalMoney = 0;
	        for (int i = 0; i < notes.length; i++) {
	            totalMoney += notes[i] * noteValues[i];
	        }

	        
	        if (totalMoney >= price) {
	            return "I can purchase";
	        } else {
	            return "I need more money";
	        }
	    }

	    public static void main(String[] args) {
	        int[] notes = {2, 1, 0, 1}; 
	        int price = 270;
	        System.out.println(canPurchase(notes, price)); 
	    }
	}

