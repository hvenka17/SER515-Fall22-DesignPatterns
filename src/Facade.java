import java.util.Scanner;

public class Facade {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public Facade() {
		System.out.println("\n>>>> FACADE PATTERN <<<<\n");
	}

	public boolean login() throws PersonNotFoundException {
		Login login = new Login();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter username: ");
		String username = scanner.nextLine();

		System.out.print("Enter password: ");
		String password = scanner.nextLine();

		if (login.authorizeUser(username, password)) {
			this.thePerson = login.findPerson(username);
			setUserType();
			return true;
		} else
			return false;
	}

	private void setUserType() {
		if(this.thePerson instanceof Buyer)
			this.UserType = 0;
		else
			this.UserType = 1;
	}

	public void addTrading() {

	}

	public void viewTrading() {
		this.thePerson.showMenu();
	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userInfoItem) {

	}

	public void createProductList() {

	}

	public void attachProductToUser() {

	}

	public Product selectProduct() {
		return null;
	}

	public void productOperation() {

	}

}
