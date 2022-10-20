import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Buyer extends Person {

	private final String userProductsPath = "UserProduct.txt";

	public Buyer(String name) {
		System.out.println("Instantiating buyer " + name);
		this.username = name;
	}
	public void showMenu() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("\nBuyer menu for " + this.username + ":");
			System.out.println("1)View product types\t2)View my bids\t3)Logout");
			System.out.print("Choose an option: ");
			int option = scanner.nextInt();
			if (option == 1) {
				showProductMenu();
			} else if (option == 2) {
				System.out.println("Bids by " + this.username + ": " + getBids());
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

	private List<String> getBids() {
		List<String> productNames = new ArrayList<String>();
		try {
			File file = new File(this.userProductsPath);
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] details = line.split(":");
				if (details[0].equals(this.username))
					productNames.add(details[1]);
			}
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		return productNames;
	}

}
