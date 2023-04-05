
public class Vehicle {
	public static void main(String[] args) {
		PetrolEngine pE = new PetrolEngine();
		pE.start();
		pE.stop();
		pE.sound();

		DesileEngine dE = new DesileEngine();
		dE.start();
		dE.stop();
	}
}
