package basic;

import java.util.Scanner;  //****!!!!!!! import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * Scanner bucky = new Scanner (System.in);		 
		   System.out.println("You input is " + bucky.nextLine());
		*/
		
		//basic calculator
		Scanner bucky = new Scanner (System.in);
		double firstnum, secondnum, answer;
		
		System.out.println("Enter First number: ");
		firstnum = bucky.nextDouble();  // variable.nextInt();
		
		System.out.println("Enter Second number: ");
		secondnum = bucky.nextDouble();
		
		answer = firstnum + secondnum;
		
		System.out.println("The sume is " + answer);
		
	}

}
