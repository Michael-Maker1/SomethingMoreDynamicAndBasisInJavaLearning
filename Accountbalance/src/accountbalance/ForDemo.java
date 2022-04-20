package accountbalance;

public class ForDemo {

	public static void main(String[] args) {
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	      System.out.print("Obere Grenze: ");
          int obereGrenze = scanner.nextInt();
       
        for( int i= 1;i  <= obereGrenze; ++i) {   
        	System.out.printf("%d                    \t  %d %n" , i, i*i);
        	
        }
          
	}

}
