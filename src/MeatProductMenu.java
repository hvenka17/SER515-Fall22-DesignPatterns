import java.util.Scanner;

public class MeatProductMenu implements ProductMenu {
	public MeatProductMenu() {
		System.out.println("\n>>>> FACTORY METHOD PATTERN <<<<\n");
		System.out.println("Instantiating MeatProductMenu");
	}

	public void showMenu() {
		System.out.println("1)View meat products\t2)Buy meat product");
		System.out.print("Choose an option: ");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		if (option == 1)
			showViewButton();
		else if (option == 2)
			showAddButton();
		else
			System.out.println("Invalid option. Exiting!");
	}

	public void showAddButton() {

	}

	public void showViewButton() {
		ProductIterator meatProductsIterator = new ProductIterator("Meat");
		while (meatProductsIterator.hasNext()) {
			Product meatProduct = meatProductsIterator.next();
			System.out.println("Meat product: " + meatProduct.name);
		}
	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}

}
