package project3;


public class Transport {

    private String name;
    private int ManufactureYear;

    public Transport(String n, int Myear) {
        name = n;
        ManufactureYear = Myear;
    }

    public String toString() {
        return "Animal[name=" + name + ",ManufacureYear=" + ManufactureYear + "]";
    }
}
