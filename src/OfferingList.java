import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OfferingList extends ArrayList {

	private OfferingList offeringList;

	private OfferingIterator offeringIterator;

	private Trading trading;

	private List<Offering> offering;

	public OfferingList() {
		this.offering = new ArrayList<Offering>();
	}

	public boolean addOffering(String productName, String sellerName) {
		Offering offering1 = new Offering(productName, sellerName);
		return this.offering.add(offering1);
	}

}
