package main;

import java.util.Scanner;

/**
 * This class handles all interaction with the user, it then 
 * gathers up the information entered by said user and stores
 * it so that the Calculator class can use it to a) keep track
 * of how many rows the user wishes to look for and b) the row
 * itself.
 * 		TODO:
 * 		  - install GUI to make the visual aspect far more 
 * 			appealing
 * 
 * @author liamheisler
 * @version 1.0.0
 */
public class Communicator {
	private static int trialNo;             //# of rows to serach
	private static int rowID; 				//Which row in the triangle?
	private static Scanner sc;              //reads user input
	
	/**
	 * Simple constructor, just initializing the scanner so we can use
	 * it to read some inputs.
	 */
	public Communicator() {
		sc = new Scanner(System.in); 
	}
	
	/**
	 * Get the number of rows the user wishes to search for.
	 * 
	 * @return Number of rows to serach for.
	 */
	public int howManyTrials() {
		System.out.print("How many rows will you be looking for?: ");
		trialNo = sc.nextInt(); 
		return trialNo;
	}
	
	/**
	 * Get the ID of the row the user wishes to obtain.
	 * 
	 * @return The row ID, which will be used by the Calculator.
	 */
	public int getRowID () {
		System.out.println("");
		System.out.print("Enter the row you wish to find: ");
		rowID = sc.nextInt(); 
		return rowID;
	}
}
