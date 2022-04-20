package accountbalance;
import java.util.*;
public class CoversionsWithMethods {
	
	static double  degree(double radians) {
		return radians * 3.14159/180.0;
	}
	static double meters(double km) {
		return km*1000.0;
	}
	static double celsuis(double f) {
		return  (1*f -32.0)*5.0/9.0;
	}
	static double length(double inches) {
		return (inches/12.0);
	}
	static double euro(double dollars) {
		return dollars * 1.14;
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please give in a Radian");
		double radians = input.nextDouble();
		double result = degree(radians);
		System.out.printf("Degrees = %f%n", result);
		
		System.out.println("Please give in Kilometers");
		double kilometers = input.nextDouble();
		double result1 = meters(kilometers);
		System.out.printf("meters = %f%n", result1);
		
		System.out.println("Please give in fahrenheit");
		double fahrenheit = input.nextDouble();
		double result2 = celsuis(fahrenheit);
		System.out.printf("celsius = %f%n", result2);
		
		System.out.println("Please give in Length ");
		double length = input.nextDouble();
		double result3 = length(length);
		System.out.printf("inches = %f%n", result3);
		
		System.out.println("Please give in dollars");
		double  dollars= input.nextDouble();
		double result4 = euro(dollars);
		System.out.printf(" Euros = %f%n", result4);
}

}
