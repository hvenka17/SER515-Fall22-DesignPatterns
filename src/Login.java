import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Login {

    private final String separator = ":";
    private final String buyersPath = "BuyerInfo.txt";
    private final String sellersPath = "SellerInfo.txt";

    private Map<String, String> buyers;
    private Map<String, String> sellers;

    public Login() {
        System.out.println("Instantiating Login");
        setBuyers();
        setSellers();
    }

    private void setBuyers() {
        this.buyers = readPersons(buyersPath);
    }
    private void setSellers() {
        this.sellers = readPersons(sellersPath);
    }

    private Map<String, String> readPersons(String path) {
        Map<String, String> names = new HashMap<String, String>();
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(line.contains(separator)) {
                    String[] credentials = line.split(separator);
                    names.put(credentials[0], credentials[1]);
                }
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
        return names;
    }

    public Person findPerson(String username) throws PersonNotFoundException {
        if(this.buyers.containsKey(username))
            return new Buyer(username);
        else if(this.sellers.containsKey(username))
            return new Seller(username);
        else
            throw new PersonNotFoundException(username);
    }

    public boolean authorizeUser(String username, String password) {
        return buyers.get(username).equals(password) || sellers.get(username).equals(password);
    }
}
