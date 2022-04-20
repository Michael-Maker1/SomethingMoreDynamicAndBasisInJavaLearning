package accountbalance;
import java.util.Scanner;
public class Ggt {
	private static int berechneGgt(int x, int y) {
		
		// for; 
		// for (<init >;<bed>; <step> {....}
//		  for( ; x>0; x-=y) {
//			  int tmp = x;
//				x = y; 
//				y= tmp; 
//		  }
		while(  x >0 ) {
			if( x< y) {
				// Variable tauschen können.
				int tmp = x;
				x = y; 
				y= tmp; 
			}
			x -= y;
		}
	return y;
	}

	public static void main(String[] args) {
	// 1. x, y einlesen
		int x, y; 
		Scanner scanner = new Scanner( System.in); 
		System.out.print("x =");
		x = scanner.nextInt();
		System.out.print("y = ");
		y= scanner.nextInt();
    // 2. ggt berechnen
		int ggt = berechneGgt( x, y);
    // 3.  ggt ausgeben
		System.out.println("ggT = " + ggt);

	}

}
