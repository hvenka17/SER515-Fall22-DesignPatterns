import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Seller extends Person {

	public Seller(String name) {
		System.out.println("Instantiating seller " + name);
		this.username = name;
	}

	public void showMenu() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("\nSeller menu for "+ this.username +": ");
			System.out.println("1)View offerings\t2)Manage offerings\t3)Logout");
			int option = scanner.nextInt();
			if (option == 1) {
				OfferingIterator offeringIterator = new OfferingIterator();
				System.out.println("Offerings by " + this.username + ": " + offeringIterator.retrieveOfferings(List.of(this.username)).stream().map(offering
						-> offering.productName).collect(Collectors.toList()));
			} else if (option == 2) {
				OfferingIterator offeringIterator = new OfferingIterator();
				List<String> offerings = offeringIterator.retrieveOfferings(List.of(this.username)).stream().map(offering -> offering.productName).collect(Collectors.toList());
				for (int i=0; i<offerings.size(); i++) {
					System.out.print("" + (i+1) + ")" + offerings.get(i) + "\t");
				}
				System.out.println("\nChoose an offer to expire it: ");
				Scanner scanner1 = new Scanner(System.in);
				int selection = scanner1.nextInt();
				Reminder reminder = Reminder.getInstance();
				reminder.notifyOffering(offerings.get(selection - 1));
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
