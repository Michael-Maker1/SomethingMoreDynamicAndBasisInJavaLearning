package accountbalance;

//abstract class GeoFigur{
//	abstract public double flaeche();
//}
interface IFigur{
	double flaeche();
}

class Kreis implements IFigur{
	double radius;
	public Kreis(double radius) {
		this.radius = radius;
	}
	
	public double flaeche() {
		return Math.PI * radius *radius;
	}
	public double addiereFlaeche(Kreis k) {
		return flaeche() + k.flaeche();
	}
	public double addiereFlaeche(Rechteck r) {
		return flaeche() + r.flaeche();
}
	public double addiereFlaeche(IFigur f) {
		return flaeche() + f.flaeche();}
		
   class Rechteck implements IFigur{
	  private int heohe, breite;
	  
	  public Rechteck(int hoehe, int breite) {
		  this.heohe = heohe;
		  this.breite = breite;
	  }
	  
	  public double flaeche() {
		  return heohe * breite;
	  }
	  
  }

public class InterfaceDemo {

	public static void main(String[] args) {
		Kreis kreis1 = new Kreis(3.0);
		Kreis kreis2 = new Kreis(2.5);
		Rechteck rechteck1 = new Rechteck(3 , 2);
		System.out.print("Fläche von Kreis1:" + kreis1.flaeche());
		System.out.print("Fläche von Kreis1:" + kreis1.addiereFlaeche(kreis2));
		System.out.print("Fläche von Kreis1:" + kreis1.addiereFlaeche(rechteck1));
		//System.out.print("Fläche von Kreis1:" + kreis1.flaeche(rechteck1));

	}

}

