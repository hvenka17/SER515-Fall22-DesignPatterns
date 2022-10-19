import java.util.Scanner;

public abstract class Person {

	private ProductMenu theProductMenu;

//	private ProductMenu productMenu;

	public Person() {
		System.out.println(">>>> BRIDGE PATTERN <<<<");
	}

	public String username;

	public abstract void showMenu();

	public void showProductMenu() {
		System.out.println("1)Meat\t2)Produce");
		System.out.print("Choose an option: ");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		if (option == 1) {
			new MeatProductMenu().showMenu();
		} else {
			new ProduceProductMenu().showMenu();
		}
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
