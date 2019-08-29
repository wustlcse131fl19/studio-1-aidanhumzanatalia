package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("Friend 1 name");
		String s1 = ap.nextString("Friend 2 name");
		String s2 = ap.nextString("Friend 3 name");
		String s3 = ap.nextString("Friend 4 name");
		//
		// Say hello to the names in s0 through s3.
		//
		String output = "Greetings " + s0 + ", " + s1 + ", " + s2 + ", " + "and " + s3 + ". " + "Y'all lookin cute today!!" ;
		System.out.println(output) ;
	}
}