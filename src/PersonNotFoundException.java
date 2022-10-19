public class PersonNotFoundException extends Exception{
    public PersonNotFoundException(String name) {
        super("Person not found - " + name);
    }
}
