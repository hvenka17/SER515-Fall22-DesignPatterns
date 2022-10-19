public class MeatProductMenu implements ProductMenu {

	public void showMenu() {
		Product meatProduct = new ProductIterator("Meat").next();
		System.out.println("Meat product: " + meatProduct.name);
	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}

}
