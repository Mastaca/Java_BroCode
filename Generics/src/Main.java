import java.util.ArrayList;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		
		/*
		MyIntegerClass myInt = new MyIntegerClass(1);
		MyDoubleClass myDouble = new MyDoubleClass(3.14);
		MyCharacterClass myChar = new MyCharacterClass('@');
		MyStringClass myString = new MyStringClass("Hello");
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());
		*/
		
		MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1,2);
		MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14, 4.58);
		//MyGenericClass<Character, Character> myChar = new MyGenericClass<>('@', 'b');
		//MyGenericClass<String, Character> myString = new MyGenericClass<>("Hello", 'a');
		
		//ArrayList<String> myFriends = new ArrayList<>();
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		//System.out.println(myChar.getValue());
		//System.out.println(myString.getValue());
		
		
	}
}