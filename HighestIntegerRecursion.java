
public class HighestIntegerRecursion {
	

	    public static int findMaxRecursively(int[] arr, int index) {
	            if (index == arr.length - 1) {
	            return arr[index];
	        }

	        int maxInRest = findMaxRecursively(arr, index + 1);

	       return Math.max(arr[index], maxInRest);
	    }

	    public static int findMax(int[] arr) {
	        if (arr == null || arr.length == 0) {
	            throw new IllegalArgumentException("Array must not be null or empty");
	        }
	      
	        return findMaxRecursively(arr, 0);
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {-1, 3, 5, 6, 99, 12, 2};
	        int[] arr2 = {6, 7, 8};

	        System.out.println("Max in arr1: " + findMax(arr1)); 
	        System.out.println("Max in arr2: " + findMax(arr2)); 
	    }
	}

