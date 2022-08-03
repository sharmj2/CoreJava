package test;

import java.util.Scanner;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Age");
	Scanner num = new Scanner(System.in);
			votingEligible(num.nextInt());

	}
	public  static void votingEligible(int age) {
		if(age>=18) {
			System.out.println("Eligible");
		}else {
			System.out.println("Ineligible");
		}
	}
	

}
