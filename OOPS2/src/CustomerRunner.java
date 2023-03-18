
public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("New Nallakunta", "Hyderabad", 500044);
		Customer customer = new Customer("Pujita", homeAddress);
		Address workAddress = new Address("Kothapet", "Hyderabad", 500035);
		customer.setOfficeAddress(workAddress);
		System.out.println(customer);
	}

}
