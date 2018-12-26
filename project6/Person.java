package project6;

/**
 * ||||>>>>>|oo$oND 6/20/2017
 */
public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void print() {
        System.out.println("\t" + firstName + " " +lastName);
    }
}
