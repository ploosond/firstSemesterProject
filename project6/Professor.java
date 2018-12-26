package project6;

/**
 * ||||>>>>>|oo$oND 6/20/2017
 */
public class Professor extends Person {
    public Professor(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public void print(){
        System.out.println("Professor Details: ");
        super.print();
    }
}
