package day1.homework;

public class FibonacciSeries {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8
	 * output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */

	public static void main(String[] args) {
		int a=0, b=1, c=1, d=1;
		System.out.println ("FIBONACCI SERIES:");
		System.out.println(a);
		for (d = 1; d < 8; d++) 
		{
			System.out.println(c);
			c=a+b;
			a=b;
			b=c;

		}

	}

	// initiaize 3 int variables (Tip: range & firstNum, secNum in the series)

	// Iterate from 1 to the range

	// Print first number 

	// add first and second number

	// Assign second nuumber to the first number

	// Assign sum to the second number



}
