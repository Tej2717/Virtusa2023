package interfaceExamples;


public class InterfaceWithMain {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();

		Aeroplane aeroplane = new Aeroplane();
		aeroplane.fly();

		
		Flyable flyable1 = new Bird();
		Flyable flyable2 = new Aeroplane();
		flyable1.fly();
		flyable2.fly();

	}
}
