package project7;


public class generic<F, M, C> {

    private final F first;

    private final M second;

    private final C third;

    public generic(F first, M second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public F first() {
        return first;
    }

    public M second() {
        return  second;
    }

    public C third() {
        return  third;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + "," + third + ")";
    }
}
