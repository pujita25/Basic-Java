
public class Fan {
	private String color;
	private String make;
	private boolean isOn;
	private double radius;
	private byte speed;

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 5);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	public String toString() {
		return "Make - " + this.make + "\n" + "Color - " + this.color + "\n" + "Radius - " + this.radius + "\n"
				+ "Is fan switched on? " + this.isOn + "\n" + "Speed - " + this.speed;
	}
}
