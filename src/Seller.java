import java.util.List;
import java.util.Scanner;

public class Seller extends Person {

	public Seller(String name) {
		System.out.println("Instantiating seller " + name);
		this.username = name;
	}

	public void showMenu() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("\nSeller menu:");
			System.out.println("1)View offerings\t2)Manage offerings\t3)Logout");
			int option = scanner.nextInt();
			if (option == 1) {
				OfferingIterator offeringIterator = new OfferingIterator();
				System.out.println("Offerings: " + offeringIterator.retrieveOfferings(List.of(this.username)));
				offeringIterator.retrieveOfferings(List.of(this.username)).forEach(offering
						-> System.out.println(offering.sellerName + " is selling " + offering.productName));
			} else if (option == 2) {
				System.out.println("No offerings made");
			} else if (option == 3) {
				System.out.println("Bye!");
				break;
			} else {
				System.out.println("Invalid option! Please try again");
			}
		}
	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
