package accountbalance;
import java.util.Scanner;

public class DivisionbyZero {

	public static void main(String[] args) {
		final int Limit = 100;
		int var;
		int number;
		for (number=1; number <=80 ; ++number) {
		System.out.print(number +"is evenly divisible by");
		for( var = 1; var <=Limit; ++var)
		if(number % var==0)
			System.out.print(var + " ");
		System.out.println();
		
			}
	
		}
}

	
