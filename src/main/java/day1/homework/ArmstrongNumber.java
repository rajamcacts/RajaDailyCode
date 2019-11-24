package day1.homework;

public class ArmstrongNumber {
	
	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153
	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Declare your input
		int i=0,j,temp;  
	    int n=153;
	    temp=n;  
	    while(n>0)  
	    {  
	    j=n%10;  
	    n=n/10;  
	    i=i+(j*j*j);  
	    }  
	    if(temp==i)  
	    System.out.println("Armstrong number");   
	    else  
	        System.out.println("Not Armstrong number");   
			
		}
		
		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
		
		
		// Assign input into variable original 
		
		
		// Use loop to calculate: which loop to use until the number greater than 0??
		
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
			
			// Within loop: Add calculated with the cube of remainder & assign it to calculated
			
			
		
		// Check whether calculated and original are same
		
			//When it matches print it as Armstrong number
			
		
		
		
		
		
		
		
		
		
		


}