public class Reminder {

    private static Reminder reminder;

    private Reminder() {
        System.out.println("\n>>>> VISITOR PATTERN <<<<\n");
    }

    public static Reminder getInstance() {
        if (reminder == null)
            reminder = new Reminder();
        return reminder;
    }

    public void notifyOffering(String productName) {
        Product product = new Product(productName);
        new ReminderVisitor(this).visitProduct(product);
    }
}
