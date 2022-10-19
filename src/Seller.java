import java.util.Scanner;

public class Seller extends Person {

	public Seller(String name) {
		System.out.println("Instantiating seller " + name);
		this.username = name;
	}

	public void showMenu() {
		System.out.println("Seller menu:");
		System.out.println("1)View offerings\t2)Manage offerings\t3)Logout");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int option = scanner.nextInt();
			if (option == 1) {
				showProductMenu();
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
