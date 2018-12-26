package project6;

/**
 * ||||>>>>>|oo$oND 6/20/2017
 */
public class Testpolymorphism {
    public static void main(String[] args) {
        Person persons[] = new Person[3];
        persons[0] = new Student("Sam", "Walton", 2012, 3.8);
        persons[1] = new Student("Bill", "Gates", 2010, 3.2);
        persons[2] = new Professor("Peter", "Noetal");

        for(Person person : persons) {
            person.print();
        }
    }
}
