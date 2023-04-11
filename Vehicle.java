
public class Vehicle {
	static int tyers;

	public static void main(String[] args) {

		System.out.println("Hello");
		PetrolEngine pE = new PetrolEngine();
		pE.start();
		pE.stop();
		pE.sound();

		DesileEngine dE = new DesileEngine();
		dE.start();
		dE.stop();

		Cng c = new Cng();
		c.start();

		ElectricEngine ee = new ElectricEngine();
		ee.start();

		HydrogneEngine he = new HydrogneEngine();
		he.start();
		he.stop();
		tyers = 4;

	}
}
