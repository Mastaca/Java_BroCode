
public class GenericMethodExample {
	public static void main(String args[]) {
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		String[] stringArray = {"B","Y","E"};
		 
		System.out.print("Integer Array: ");
		displayArray(intArray);
		System.out.println(getFirstElement(intArray));
		
		System.out.print("Double Array: ");
		displayArray(doubleArray);
		System.out.println(getFirstElement(doubleArray));
		
		System.out.print("Character Array: ");
		displayArray(charArray);
		System.out.println(getFirstElement(charArray));
		 
		System.out.print("String Array: ");
		displayArray(stringArray);
		System.out.println(getFirstElement(charArray));
     
	}
  
  // Generic method
	public static <Thing> void displayArray(Thing[] array) {
	
		for(Thing x : array) {
	       System.out.print(x + " ");
	    }
	    System.out.println();
	}
	
	public static <Thing> Thing getFirstElement(Thing[] array) {
		return array[0];		
	}
  
}


