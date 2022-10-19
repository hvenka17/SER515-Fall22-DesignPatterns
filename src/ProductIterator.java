public class ProductIterator implements ListIterator {

	private ClassProductList classProductList;

	private static int nextIndex = 0;

	private String productType;

	public ProductIterator(String productType) {
		System.out.println(">>>> ITERATOR PATTERN <<<<");
		this.productType = productType;
	}

	public boolean hasNext() {
		return false;
	}

	public Product next() {
		String name = new ClassProductList().viewProducts(this.productType).get(nextIndex);
		nextIndex++;
		return new Product(name);
	}

	public void moveToHead() {

	}

	public void remove() {

	}

}
