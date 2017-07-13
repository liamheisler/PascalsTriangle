package main;

/**
 * This is a simple piece of software to calculate the nth row of 
 * Pascal's Triangle. This can be used to find coefficients in
 * binomial expansion problems in Algebra or Calculus courses.
 * 
 * The user enters in just two data points. First, they tell the 
 * computer how many rows they wish to search for. Next, they
 * tell the computer which row to actually go and get. The computer
 * then, based on this info, calculates and displays the row in
 * a neat and easy-to-read format.
 * 		TODO: 
 * 		  - write an actual GUI
 * @author liamheisler
 * @version 1.0.0
 *
 */

public class Main {
	private static Calculator calculator = new Calculator();
	private static Communicator communicator = new Communicator();
	
	//MAIN METHOD
	public static void main(String[] args) {
		int trials = communicator.howManyTrials();
		for(int i = 1; i <= trials; i++) {
			int n = communicator.getRowID(); 
			calculator.findRow(n);
			calculator.printRow();
		}	
		System.out.println("");
		System.out.println("Thank you for using this simple software!");
	}
}
