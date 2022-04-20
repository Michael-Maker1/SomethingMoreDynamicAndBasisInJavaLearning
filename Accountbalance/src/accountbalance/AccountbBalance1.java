package accountbalance;
import java.util.Scanner;

public class AccountbBalance1 {

	public static void main(String[] args) {
		double balance;
		int reponse;
		int year =1;
		final double INT_RATE = 0.03;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter intial bank balane <");
		balance = keyboard.nextDouble();
		System.out.print("Do you want to see your next year's balance");
		System.out.print("Enter 1 for yes");
		System.out.print("or any other number for no  >>");
		reponse = keyboard.nextInt();
		do {
			balance = balance*(1+INT_RATE);
			System.out.print("After year"+ year +"at"+INT_RATE + "interest rate,balance $"+ balance);
			year = year+1;
			System.out.println("Do you want to see the balance "+ "at the end of another year?");
			System.out.print("Enter 1 for yes");
			System.out.print("or an other number for no");
			reponse = keyboard.nextInt();	}
		while(reponse ==1);
		}}
