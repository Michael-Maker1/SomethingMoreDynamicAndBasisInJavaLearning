package accountbalance;
import java.util.Scanner;
public class ValidatingData {

	public static void main(String[] args) {
		int useEntry;
		final int LIMIT = 3;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer no higher than "+ LIMIT + ">");
				useEntry = input.nextInt();
		while(useEntry > LIMIT) {
			System.out.println("The number you enteredw was too high");
			System.out.print("Please enter an integer no higher than"+ LIMIT +">");
			useEntry = input.nextInt();
		}
		
		System.out.println("i love you");
	}

}
