package accountbalance;

public class printGrid {

	public static void main(String[] args) {
		printGrid(4,6);}
		public static void printGrid(int no1, int no2) {
		for(no1=1; no1<=4; no1++) {
			for( no2 =1; no2<=21; no2++) {
				no2+=4;
				System.out.print(no2);
			}
			System.out.println();
		}
			
		

	}

}
