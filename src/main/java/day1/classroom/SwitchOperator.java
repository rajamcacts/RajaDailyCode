package day1.classroom;

import org.apache.commons.collections4.functors.SwitchClosure;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	

	public static void main(String[] args) {
		int i=2, j=3, k=5;
		switch (k) {
		case 1:
			System.out.println(i+j);
			break;
		case 2:
			System.out.println(i-j);
			break;
		case 3:
			System.out.println(i*j);
			break;
		case 4:
			System.out.println(i/j);
			break;
		default:
			System.out.println(k);
			break;
		}
	}

	// Declare 2 integer numbers


	// Declare a String variable with input as operations (Tip:


	// Initiate switch case for operations


	// Within switch, include as case for add operation


	// Within switch, include as case for sub operation


	// Within switch, include as case for mul operation


	// Within switch, include as case for div operation


	// Within switch, include 'default' to handle other operations


	//end of switch case

}

