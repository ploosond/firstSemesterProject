package project3;


public class Bike extends Transport {

    private double prcie;

    public Bike(String n, int Myear, double p) {
        super(n, Myear);
        prcie = p;
    }

    public String toString() {
        return "Bike[super=" + super.toString() + ",prcie=" + prcie + "]";
    }

}
