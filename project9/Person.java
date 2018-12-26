package project9;

/**
 * ||||>>>>>|oo$oND 6/20/2017
 */
interface Person {
    void walk();

    default void sayHello() {
        System.out.println("default Hello...");
    }
}
