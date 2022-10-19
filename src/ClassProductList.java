import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ClassProductList extends ArrayList {

	private ProductIterator productIterator;

	private ReminderVisitor reminderVisitor;

	private Product[] product;

	private final String productInfoPath = "ProductInfo.txt";

	public void accept(NodeVisitor visitor) {

	}

	public List<String> viewProducts(String type) {
		Map<String, ArrayList<String>> products = new HashMap<String, ArrayList<String>>();
		try {
			File file = new File(productInfoPath);
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String[] productListing = scanner.nextLine().split(":");
				if (products.containsKey(productListing[0]))
					products.get(productListing[0]).add(productListing[1]);
				else {
					ArrayList<String> list = new ArrayList<String>();
					list.add(productListing[1]);
					products.put(productListing[0], list);
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		return products.get(type);
	}

}
