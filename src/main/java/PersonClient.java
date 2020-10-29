public class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Isabella", "Smith", 1999);
        System.out.println(p1.getFirstName()); // Isabella
        p1.setFirstName("Bella");
        System.out.println(p1.getFirstName()); // Bella
    }
}
