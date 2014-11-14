/*
Assignment 1
Mario Lacayo 5657
Csc 221
06/1/2012 
 */

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		HeartRates heart = new HeartRates();
		System.out.println("This is a target heart rate calculator");
		System.out.println("Please enter your first name:");
		String name = input.nextLine();
		heart.Set_Firstname(name);
		
		System.out.println("Please enter your last name:");
		name = input.nextLine();
		heart.Set_Lastname(name);
		
		System.out.println("Please enter Birthdayin the following format(mm dd yyyy):");
		int month = input.nextInt();
		int day = input.nextInt();
		int year = input.nextInt();
	
		heart.Set_Date(month, day, year);
		
		System.out.println("First name: " + heart.Get_Firstname());
		System.out.println("Last name: " + heart.Get_Lastname());
		System.out.println("DOB: " + heart.Get_Date());
		System.out.println("Age: " + heart.Calc_Age() + " years");
		System.out.println("Maximum heart rate: " + heart.Calc_Maxheart() + " beats per min");
		System.out.println("Target heart rate range: " + heart.Calc_Tarheartup() + " - " + heart.Calc_Tarheartdown() + " beats per min");
		

	}

}
