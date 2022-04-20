package accountbalance;
import java.util.Scanner;

public class Armstrong{
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  
	System.out.print("Bitte geben Sie eine untere Grenze ein:");	
       int eingeben1 = scanner.nextInt();
       System.out.print("Bitte geben Sie eine obere Grenze ein:");
       int eingeben2 = scanner.nextInt();
         for( int i  =  eingeben1; i <= eingeben2 ; i++)
{			if( isArmstrong(i) == true ){
		    	System.out.println(i + " "+ "ist eine Armstrong");}}}
		 
	public static boolean isArmstrong(int num)
		{ int sum = 0; int copyOfInput = num; int summe= 0; int sum1= 0;
		int sum2 = 0; int rem = 0; int count = 0;
		
	
	   	while (copyOfInput != 0) {
		int lastDigit = copyOfInput % 10; 
		sum += (lastDigit * lastDigit * lastDigit);
		summe +=(lastDigit*lastDigit*lastDigit*lastDigit);	
		 copyOfInput = copyOfInput /10;}	
	if (num== sum || summe == num) { 
           return true; } 
		return false;  

              
	}}
	

