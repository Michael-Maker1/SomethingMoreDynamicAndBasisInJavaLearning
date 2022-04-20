package accountbalance;
import java.util.Scanner;
public class Zylinder {

	public static void main(String[] args) {
		 Scanner eingeben =new Scanner(System.in);
			System.out.print("Bitte Radius eingeben: ");
	        double radius = eingeben.nextDouble();
	        System. out.print("Bitte Hoehe eingeben: ");
	        double hoehe = eingeben.nextDouble();
	        double volumen = (radius*radius)* Math.PI * hoehe;
	        double oberflaeche = (2*(radius*radius)*Math.PI )+(2*radius*Math.PI*hoehe);
	        System.out.println("Oberflaeche: "+ " "+ oberflaeche);
	        System.out.print("Volumen: "    + " "+ volumen);
		
	}

}
