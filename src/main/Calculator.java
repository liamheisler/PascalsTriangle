package main;

import java.util.ArrayList;

/**
 * This class handles all calculating and displaying of the 
 * selected row, which is entered by the user.
 * 
 * @author liamheisler
 * @version 1.0.0
 */

public class Calculator {
	private String row;                 //text to be displayed to the user.
	private ArrayList<Integer> res;     //int array list of the row's values
	
	/**
	 * Simple constructor, just initializing some variables.
	 */
	public Calculator() {
		row = ""; 
		res = new ArrayList<Integer>();
	}
	
	/**
	 * Print the row itself to the terminal in an easy to read format.
	 */
	public void printRow() {
		//int max = res.size() - 1;
		for(int n : res) {
			System.out.print(n + "    ");
		}
		//System.out.println(row);
	} 
	
	/**
	 * Calculate the row. 
	 * 
	 * @param rowIndex  Which row should I calculate?
	 * @return An ArrayList of the values in the row.
	 */
	public ArrayList<Integer> findRow(int rowIndex) {
	    if(rowIndex<0)
	        return res;
	    res.add(1);
	    for(int i=1;i<=rowIndex;i++)
	    {
	        for(int j=res.size()-2;j>=0;j--)
	        {
	            res.set(j+1,res.get(j)+res.get(j+1));
	        }
	        res.add(1);
	    }
	    return res;
	}
}