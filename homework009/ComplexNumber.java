package homework009;

import org.springframework.stereotype.Component;

/**
 * Created by rubenahmadiev on 25.02.16.
 */
@Component
public class ComplexNumber {
    private double re;
    private double im;

    public double getRe() {
        return this.re;
    }

    public double getIm() {
        return this.im;
    }

    public ComplexNumber() {
        this(0.0D, 0.0D);
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumber add(ComplexNumber n2) {
        ComplexNumber n_sum = new ComplexNumber(this.re + n2.getRe(), this.im + n2.getIm());
        return n_sum;
    }

    public void add2(ComplexNumber n2) {
        this.re += n2.getRe();
        this.im += n2.getIm();
        System.out.println(this.toString());
    }

    public ComplexNumber sub(ComplexNumber n2) {
        ComplexNumber n_sub = new ComplexNumber(this.re - n2.getRe(), this.im - n2.getIm());
        return n_sub;
    }

    public void sub2(ComplexNumber n2) {
        this.re -= n2.getRe();
        this.im -= n2.getIm();
        System.out.println(this.toString());
    }

    public ComplexNumber multNumber(double x) {
        ComplexNumber n_multN = new ComplexNumber(this.re * x, this.im * x);
        return n_multN;
    }

    public void multNumber2(double x) {
        this.re *= x;
        this.im *= x;
        System.out.println(this.toString());
    }

    public ComplexNumber mult(ComplexNumber n2) {
        ComplexNumber n_mult = new ComplexNumber(this.re * n2.getRe() - this.im * n2.getIm(), this.im * n2.getRe() + this.re * n2.getIm());
        return n_mult;
    }

    public void mult2(ComplexNumber n2) {
        double as = this.re;
        this.re = this.re * n2.getRe() - this.im * n2.getIm();
        this.im = this.im * n2.getRe() + as * n2.getIm();
        System.out.println(this.toString());
    }

    public ComplexNumber div(ComplexNumber n2) {
        double c = (this.re * n2.getRe() + this.im * n2.getIm()) / (n2.getRe() * n2.getRe() + n2.getIm() * n2.getIm());
        double d = (this.im * n2.getRe() - this.re * n2.getIm()) / (n2.getRe() * n2.getRe() + n2.getIm() * n2.getIm());
        ComplexNumber n_div = new ComplexNumber(c, this.im * n2.getRe() + this.re * n2.getIm());
        return n_div;
    }

    public void div2(ComplexNumber n2) {
        double c = (this.re * n2.getRe() + this.im * n2.getIm()) / (n2.getRe() * n2.getRe() + n2.getIm() * n2.getIm());
        double d = (this.im * n2.getRe() - this.re * n2.getIm()) / (n2.getRe() * n2.getRe() + n2.getIm() * n2.getIm());
        System.out.println(this.toString());
    }

    public double length() {
        return Math.sqrt(this.re * this.re + this.im * this.im);
    }

    public String toString() {
        return this.im < 0.0D?this.re + " - " + Math.abs(this.im) + " * i":this.re + " + " + Math.abs(this.im) + " * i";
    }

    public double arg() {
        return Math.atan(this.im / this.re);
    }

    public ComplexNumber pow(double n) {
        ComplexNumber n_pow = new ComplexNumber(Math.pow(this.length(), n) * Math.cos(n * this.arg()), Math.pow(this.length(), n) * Math.sin(n * this.arg()));
        return n_pow;
    }

    public boolean equals(ComplexNumber n2) {
        return this.re == n2.getRe() && this.im == n2.getIm();
    }


}