
public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer1", 5.67, "Black");

		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte) 4);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}

}
