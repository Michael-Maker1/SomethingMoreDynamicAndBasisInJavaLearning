package accountbalance;
import java.util.Scanner;
public class Ln2Iter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	      
	      int n  ;
	           double summe =0;
	             double increment;	
	             
	             
	        	 do {    System.out.print("Bitte n > 0 eingeben (0 zum Beenden) : ");
	  		   n  = input.nextInt() ;
	  		     if(n ==0) {
	  			   break ;}
	        	 for( increment = 1; increment <= n ; increment++) {
	    	  if( increment %2 == 0) {
	    		  summe =  summe - (1/increment);}
	  		  if( increment%2 !=0 ) {
	    		 summe =  summe + ( 1/ increment);}}   	        
	        	 
	 System.out.println( "ln(2) ist die Nahrungsweise ; " + summe );
	        	
	        summe =0;} 
	        	 
	        	 
	              	while(n !=0);	

	}

}
