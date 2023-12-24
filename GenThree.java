/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */

import java.util.Random;

public class GenThree {
	public static void main(String[] args) {
	    Random rand = new Random();
        int min=Integer.parseInt(args[0]), max=Integer.parseInt(args[1]);
		int a= rand.nextInt(max - min + 1) + min;
		int b= rand.nextInt(max - min + 1) + min;
		int c= rand.nextInt(max - min + 1) + min;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);	
		System.out.println("The minimal generated number was "+ Math.min(Math.min(a, b), c));
	}
}
