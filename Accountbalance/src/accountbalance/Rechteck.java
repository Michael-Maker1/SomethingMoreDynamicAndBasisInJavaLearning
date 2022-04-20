package accountbalance;

public class Rechteck {
	private int laenge , hoehe;
     public Rechteck(int laenge, int hoehe) {
		this.laenge = laenge;
		this.hoehe = hoehe;
	}
 	@Override //Pruefung von Korrektheit
 	public String toString() {
 		return "Rechteck [laenge=" + laenge + ", hoehe=" + hoehe + "]";

	//Konstruktor
 		public void setSeiten(int laenge, int breite) {
 			this.laenge = laenge;
 			this.hoehe = hoehe;
 		}
 		public void setSeiten( int seitenlaenge) {
 			setSeitenlaenge(seitlaenge, seitenlaenge);
 		}
	
	public static void main(String[] args) {
	
		Rechreck r1 = new Rechteck(100, 20);
		System.out.println(r1);
		r1.setSeiten(2,4);
		
		

	}


	}

}
