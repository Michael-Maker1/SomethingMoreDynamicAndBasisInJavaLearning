package accountbalance;
import java.util.*;
public class HcfsandLcfs {
	//fn---> Firt digit Number
	// sn ----> Second digit Number
	
	static int hcf(int fn , int sn) {
		int gcf = 1;
		for( int i = 1; i <= fn && i <= sn; i++) {
			if( fn%i ==0 && sn%i == 0 ) {
			gcf =i;
			}
		}
		return gcf;
	}
	
	static int lcf(int fn , int sn) {
		int gcf= 1;
		int lcf =1;
		for( int i = 1; i <= fn && i <= sn; i++) {
			if( fn%i ==0 && sn%i == 0 ) {
			gcf= i;
			lcf = (fn* sn)/gcf;
			
			}
		}
		return lcf;
	}

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Please give two numbers for Highest common Factor" );
	int result =  hcf( input.nextInt(), input.nextInt());
	System.out.printf("Your Hcf  is ; %d%n ", result);

	
	System.out.println("Please give two numbers for Lowest common Factor" );
	int result1 =  lcf( input.nextInt(), input.nextInt());
	System.out.printf("Your Lcf  is ; %d%n ", result1);
	}

}
