package project1;


public class Complex {

    public final double re;
    public final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
     public Complex add(Complex other) {
        return new Complex(this.re + other.re,this.im + other.im);
     }
     public Complex sub(Complex other) {
        return new Complex( this.re - other.re, this.im - other.im);
     }
     public Complex multi(Complex other) {
        return new Complex( this.re * other.re + this.im * other.im, this.im * other.re + this.re * other.im);
     }
     public Complex divide(Complex other) {
        return new Complex((this.re * other.re + this.im * other.im)/(other.re * other.re + other.im * other.im),
                (this.im * other.re - this.re * other.im)/(other.re * other.re + other.im * other.im));
     }
     public Complex conjugate() {
        return new Complex(this.re, - this.im);
     }
}
