public class OfferingIterator implements ListIterator {

	public OfferingIterator() {
		System.out.println(">>>> ITERATOR PATTERN <<<<");
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

}
