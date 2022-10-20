import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ClassProductList classProductList;

	private final String userProductsPath = "UserProduct.txt";

	public ReminderVisitor(Reminder reminder) {
		System.out.println("\n>>>> VISITOR PATTERN<<<<\n");
		this.m_Reminder = reminder;
		this.classProductList = new ClassProductList();
	}

	public void visitProduct(Product product) {
		List<String> persons = new ArrayList<String>();
		try {
			File file = new File(this.userProductsPath);
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] userProduct = line.split(":");
				if (userProduct[1].equals(product.name))
					persons.add(userProduct[0]);
			}
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		persons.forEach(person -> System.out.println("Sending notification about " + product.name + " to " + person));
	}

	public void visitTrading(Trading trading) {

	}

	public void visitFacade(Facade facade) {

	}

}
