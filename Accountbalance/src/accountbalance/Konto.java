package accountbalance;

	public class Konto {
		// Attribute Immer private machen
		private String nr;
		private int geheimzahl;
		private double kontoStand;
		
		// Kontruktor
		public Konto(String pNr, double kontoStand, int geheimzahl) {
			nr = pNr; // Attribut := Parameter
			this.kontoStand = kontoStand;
			this.geheimzahl = geheimzahl;
		}
		
		public void zahleEin(double betrag) {
			kontoStand += betrag;
		}
		public Konto(String nr) {
			this(nr, INITIALER_KONSTAND,1111); //( Konstruktor Verkettung) für WiederVerwendung
	
		}
		
		public void druckeAus() {
			System.out.printf("Konto %s: Kontostand %.2f €%n", nr, kontoStand);
		}
		public void geheimZahlAendern( int alteGeheimzahl, int neueGeheimzahl) {
			if(alteGeheimzahl == neueGeheimZahl) {
				geheimzahl = neueGeheimzahl;
			}
			public String toString() {
return String.format("Konto %s: Kontostand %.2f€, Geheimzahl; %dn", nr, kontoStand, geheimzahl);
			}
		}
		
		
		
		public static void main(String[] args) {
			Konto konto1 = new Konto("4711", 120.45, 1234);
			konto1.zahleEin(100.0);
			konto1.druckeAus();
			Konto konto2 = new Konto("4712", 0.0, 9876);
			konto2.zahleEin(100000.0);
			konto2.druckeAus();
			
			
			Konto konto3 = new Konto("4713");f
			System.out.println(konto3);

}}
