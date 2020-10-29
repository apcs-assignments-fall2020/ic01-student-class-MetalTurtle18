public class Person {
    // Instance variables: every person has a first name and last name
    private String firstName;
    private String lastName;
    private int classYear;

    // Constructor: creates a Person with the given first name and last name
    public Person(String firstName, String lastName, int classYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classYear = classYear;
    }

    // Default Constructor: creates a generic person
    public Person() {
        this.firstName = "John";
        this.lastName = "Smith";
        this.classYear = 2020;
    }

    // doSomething(): an example of a non-static method for the Person class.
    //                This method just prints out a message saying something a 
    //                normal person might say
    public void doSomething() {
        System.out.println("I'm watching Netflix");
    }

    // toString(): returns a String representation of a Person (their full name)
    public String toString() {
        return firstName + " " + lastName + ", " + classYear;
    }

    // getters: return the values of the instance variables
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getClassYear() {
        return this.classYear;
    }

    // setters: changes the value of the instance variables
    public void setFirstName(String firstName) {
        if (firstName.trim().length() != 0) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName.trim().length() != 0) {
            this.lastName = lastName;
        }
    }

    public void setClassYear(int classYear) {
        if (classYear > 0) {
            this.classYear = classYear;
        }
    }
}