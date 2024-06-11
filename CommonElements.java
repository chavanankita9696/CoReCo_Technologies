import java.util.*; 
public class CommonElements {
	

	   public static void main(String[] args) {
	      int[] array1 = {56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 88, 72, 73, 74, 75, 76, 77, 78, 79, 80};
	      int[] array2 = {81, 82, 83, 1, 84, 85, 86, 87, 88, 60, 89, 90,1, 91, 92, 93};
	      List<Integer> commonElements = new ArrayList<>();
	      for (int i = 0; i < array1.length; i++) {
	         for (int j = 0; j < array2.length; j++) {
	            if (array1[i] == array2[j]) {
	               commonElements.add(array1[i]);
	               break;
	            }
	         }
	      }
	      System.out.println("Common Elements: " + commonElements);
	   }
	}

