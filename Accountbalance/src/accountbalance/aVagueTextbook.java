package accountbalance;

public class aVagueTextbook {
	static final int SUB_HEIGHT=10;
        	public static void Top_Surface() {
        		
        		for(int spaces=1; spaces<=SUB_HEIGHT;spaces++) {
        			System.out.print("  ");
        		}
        		System.out.print("+");
        		for(int i=1; i<=30;i++) {
        			System.out.print("-");
        		}
        		System.out.print("+");
        		for(int spaces=1; spaces<=SUB_HEIGHT; spaces++) {
        			System.out.print(" ");
        			System.out.print("/");
        		}
        		
        		}
        	




	public static void main(String[] args) {
	Top_Surface();

	}

}
