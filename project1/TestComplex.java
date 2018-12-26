package project1;


public class TestComplex {
    public static void main(String[] args) {
        Complex a = new Complex(4, 6);
        Complex b = new Complex(2, 3);
        Complex c = a.add(b);
        Complex d = a.sub(b);
        Complex e = a.multi(b);
        Complex f = b.divide(a);
        Complex g = a.conjugate();
        System.out.println(c.re);
        System.out.println(c.im);
        System.out.println(d.re);
        System.out.println(d.im);
        System.out.println(e.re);
        System.out.println(e.im);
        System.out.println(f.re);
        System.out.println(f.im);
        System.out.println(g.re);
        System.out.println(g.im);
    }
}
