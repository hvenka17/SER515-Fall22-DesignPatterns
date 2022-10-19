import java.util.Scanner;

public class Buyer extends Person {

	public Buyer(String name) {
		System.out.println("Instantiating buyer " + name);
		this.username = name;
	}
	public void showMenu() {
		System.out.println("Buyer menu:");
		System.out.println("1)View products\t2)View my bids\t3)Logout");
		System.out.print("Choose an option: ");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int option = scanner.nextInt();
			if (option == 1) {
				showProductMenu();
			} else if (option == 2) {
				System.out.println("No bids made");
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
