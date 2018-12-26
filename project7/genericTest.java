package project7;


public class genericTest {

    static generic<Integer, Integer, Integer> goo(int x) {
        return new generic<>(x + 2, x - 4, x * 2);
    }

    public static void main(String[] args) {
        generic<Integer, Integer, Integer> p = new generic<>(2, 3, 4);
        System.out.println(p);
        System.out.println(goo(5));

        generic<String, Integer, Boolean>p1 = new generic<>("RDLAP", 1, Boolean.TRUE);
        String s1 = p1.first();
        Integer b1 = p1.second();
        Boolean d1 = p1.third();

        System.out.println("[FIRST=" + s1 + ",SECOND=" + b1 + ",THIRD=" + d1 + "]");



    }
}
