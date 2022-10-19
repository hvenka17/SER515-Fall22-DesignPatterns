public class Main {
    public static void main(String[] args) {
        try {
            Facade facade = new Facade();
            if (facade.login()) {
                facade.viewTrading();
            }
            else
                System.out.println("User credentials is invalid");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}