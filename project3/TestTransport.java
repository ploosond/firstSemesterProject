package project3;


public class TestTransport {

    public static void main(String[] args) {
        Transport a = new Transport("Penydarren", 1804);
        Bike b = new Bike("KTM 690 Duke", 2016, 4500.00);
        Train c = new Train("ZTM Warszawa", 1992, 348 );
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
