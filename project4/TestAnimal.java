package project4;


public class TestAnimal {

    public static long Elephant(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return Elephant(n - 1) + Elephant(n -2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++); {
            long start = System.currentTimeMillis();
            long result = Elephant(42);
            long end = System.currentTimeMillis();
            System.out.println("Result " + result + " in " + (end - start) + " numberOfcells");
        }
    }

    {
        Elephant e = new Elephant();
        e.useTrunk();
        e.digest(10);
        System.out.println(e.numberOfCells());
    }
}
