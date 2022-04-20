package accountbalance;

public class Rocketship {
public static void main(String... args) {
	top();
	middleLine();
	topHalfSection();
	topBottomSection();
	middleLine();
	topBottomSection();
	topHalfSection();
	middleLine();
	top();
} 
public static void middleLine() {
	System.out.print("+");
	for(int i=1; i<=6; i++) {
		System.out.print("=*");
	}
	System.out.print("+");
	System.out.println();
}


public static void top() {
	for(int line=1; line<=5; line++) {
		for(int i=1;i<=(-line+6); i++) {
			System.out.print(" ");
		}
		for(int i=1;i<=line;i++ ) {
			System.out.print("/");
		}
		for(int i=1; i<=2; i++) {
			System.out.print("*");
		}
		for(int i=1;i<=line;i++ ) {
			System.out.print("\\");}
		System.out.println();
	}}
	public static void topHalfSection() {
		for(int line=1; line<=3; line++) {
			for(int i=1; i<=1; i++) {
					System.out.print("|");}
			for(int dots=1; dots<=(-line+3); dots++) {
				System.out.print("*");}
			for(int traingle=1; traingle<=line ;traingle++) {
				System.out.print("/\\");}
			for(int middleDots=1; middleDots<=(-line*2)+6; middleDots++) {
				System.out.print("*");
			}
			
		for(int traingle=1; traingle<=line ;traingle++) {
			System.out.print("/\\");}
		for(int dots=1; dots<=(-line+3); dots++) {
			System.out.print("*");}
		for(int i=1; i<=1; i++) {
			System.out.print("|");}
		System.out.println();
		}}
			

	
		
		
		public static void topBottomSection() {
			for(int line=1; line<=3; line++) {
				for(int i=1; i<=1; i++) {
						System.out.print("|");}
				for(int i=1;i<=(line-1);i++) {
					System.out.print("*");
				}
				for(int i=1; i<=(4-line);i++) {
					System.out.print("\\/");
				}
				for(int i =1; i<=(2*line-2);i++) {
					System.out.print("*");
				}
				for(int i=1; i<=(4-line);i++) {
					System.out.print("\\/");}
				for(int i=1;i<=(line-1);i++) {
					System.out.print("*");}
				for(int i=1; i<=1; i++) {
					System.out.print("|");}
			
		
		
			System.out.println();
		}
		
		
	}
}



