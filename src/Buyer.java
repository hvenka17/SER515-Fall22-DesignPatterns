import java.util.Scanner;

public class Buyer extends Person {

	public Buyer(String name) {
		System.out.println("Instantiating buyer " + name);
		this.username = name;
	}
	public void showMenu() {
		System.out.println("Buyer menu:");
		System.out.println("1)View products\t2)View my bids");
		System.out.print("Choose an option: ");
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
