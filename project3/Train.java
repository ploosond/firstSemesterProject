package project3;


public class Train extends Transport{

    private double capacity;

    public Train(String n, int Myear, double c) {

        super(n, Myear);
        capacity = c;
    }

    public String toString() {

        return "Space[super=" + super.toString() +",capacity=" + capacity + "]";
    }
}
