
public class Address {
	private String line1;
	private String city;
	private int zip;
	public Address(String line1, String city, int zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}

	public String toString() {
		return String.format("Line 1 - %s \nCity - %s\nZip - %d", line1, city, zip);
	}
}
