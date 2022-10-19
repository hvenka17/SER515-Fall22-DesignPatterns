import java.util.Scanner;

public class ProduceProductMenu implements ProductMenu {

	public ProduceProductMenu() {
		System.out.println(">>>> FACTORY METHOD PATTERN <<<<");
	}

	public void showMenu() {
		System.out.println("1)View produce products\t2)Buy produce product");
		System.out.print("Choose an option: ");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		if (option == 1)
			showViewButton();
		else if (option == 2)
			showAddButton();
		else
			System.out.println("Invalid option!");
	}

	public void showAddButton() {

	}

	public void showViewButton() {
		Product produceProduct = new ProductIterator("Meat").next();
		System.out.println("Produce product: " + produceProduct.name);
	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}

}
