import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class OfferingIterator implements ListIterator {

	private final String userProductFilePath = "UserProduct.txt";

	public OfferingIterator() {
		System.out.println("\n>>>> ITERATOR PATTERN <<<<\n");
	}

	private OfferingList offeringList;

	public boolean hasNext() {
		return false;
	}

	public Offering next() {
		return null;
	}

	public void moveToHead() {

	}

	public void remove() {

	}

	public OfferingList retrieveOfferings(List<String> sellers) {
		OfferingList list = new OfferingList();
		try {
			File file = new File(this.userProductFilePath);
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String[] productInfo = scanner.nextLine().split(":");
				if (sellers.contains(productInfo[0])) {
					list.addOffering(productInfo[1], productInfo[0]);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found - " + e.getMessage());
		}
		return list;
	}

}
