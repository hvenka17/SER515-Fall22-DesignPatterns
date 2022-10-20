import java.util.Iterator;

public class ProductIterator implements ListIterator {

	private ClassProductList classProductList;
	private Iterator<String> iterator;

	private static int nextIndex = 0;

	private String productType;

	public ProductIterator(String productType) {
		System.out.println("\n>>>> ITERATOR PATTERN <<<<\n");
		this.productType = productType;
		this.iterator = new ClassProductList().viewProducts(productType).iterator();
	}

	public boolean hasNext() {
		return this.iterator.hasNext();
	}

	public Product next() {
		String name = this.iterator.next();
		return new Product(name);
	}

	public void moveToHead() {

	}

	public void remove() {

	}

}
