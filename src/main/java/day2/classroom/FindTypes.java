package day2.classroom;

public class FindTypes {


	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Automation Class $$ ";
		char[] array = test.toCharArray();
		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		for (int i = 0; i < array.length; i++) {
			if(Character.isLetter(array[i])) {
				letter +=1;}
			else if (Character.isDigit(array[i])) {
				num +=1;}
			else if (Character.isSpaceChar(array[i])) {
				space +=1;}
			else {
				specialChar +=1;
			}

		}
		
		System.out.println("letter: " +letter);
		System.out.println("Space: " +space);
		System.out.println("Numbers: " +num);
		System.out.println("Special Chanracters: " +specialChar);
		
	}

}	
	// Build the logic to find the count of each
	/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) Find if the given character is what type using (if)
					i)  Character.isLetter
					ii) Character.isDigit
					iii)Character.isSpaceChar
					iv) else -> consider as special character
	 */

	// Print the count here

