import java.util.Scanner;

public abstract class Person {

	private ProductMenu theProductMenu;

//	private ProductMenu productMenu;

	public Person() {
		System.out.println("\n>>>> BRIDGE PATTERN <<<<\n");
	}

	public String username;

	public abstract void showMenu();

	public void showProductMenu() {
		System.out.println("\n1)Meat\t2)Produce");
		System.out.print("Choose an option: ");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		ProductMenu productMenu = null;
		if (option == 1) {
			productMenu = new MeatProductMenu();
		} else if (option == 2) {
			productMenu = new ProduceProductMenu();
		}
		if (productMenu != null)
			productMenu.showMenu();
	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public abstract ProductMenu CreateProductMenu();

}
