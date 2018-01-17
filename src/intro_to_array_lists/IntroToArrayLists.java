package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> x = new ArrayList<String>();
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
		x.add("Lorem");
		x.add("Ipsum");
		x.add("Dolor");
		x.add("Si");
		x.add("Amet");
		
		System.out.println("\n~-=Aleksa's ArrayList (and sad attempt at Latin)=-~\n\n");
		
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < x.size(); i++) {
			String s = x.get(i);
			System.out.println("String at element " +i+": "+s+";");
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for(String s : x) {
			System.out.println("String at element (not defined because this is a foreach loop): "+s+";");
		}
		System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < x.size(); i++) {
			if(i%2 == 0) {
				System.out.println("String at element "+i+": "+x.get(i)+";");
			} else {
				System.out.println("Element "+i+" is not even;");
			}
		}
		System.out.println("\n");
		//6. Print all the Strings in reverse order.
		for(int i = x.size() - 1; i >= 0; i -= 1) {
			System.out.println("String at element "+i+": "+x.get(i)+";");
		}
		System.out.println("\n");
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i < x.size(); i++) {
			String s = x.get(i);
			if(s.contains("e") || s.contains("E")) {
				System.out.println("String at element "+i+": "+s+" (contains 'e');");
			} else {
				System.out.println("Element "+i+" does not contain 'e';");
			}
		}
	}
}
