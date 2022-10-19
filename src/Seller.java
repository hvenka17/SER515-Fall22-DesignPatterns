import java.util.Scanner;

public class Seller extends Person {

	public Seller(String name) {
		System.out.println("Instantiating seller " + name);
		this.username = name;
	}

	public void showMenu() {
		System.out.println("Seller menu:");
		System.out.println("1)View offerings\t2)Manage offerings");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		switch (option) {
			case 1:
				showProductMenu();
				break;
			case 2:
				System.out.println("No bids made");
				break;
			default:
				System.out.println("Invalid option");
		}
	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
