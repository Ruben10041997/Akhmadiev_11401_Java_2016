package homework009;

import org.springframework.stereotype.Component;

/**
 * Created by rubenahmadiev on 25.02.16.
 */

@Component
public class ComplexMatrix2x2 {

    private ComplexNumber[][] a = new ComplexNumber[2][2];

    public ComplexNumber getA(int i, int j) {
        return this.a[i][j];
    }

    public ComplexMatrix2x2() {
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                this.a[i][j] = new ComplexNumber();
            }
        }

    }

    public ComplexMatrix2x2(ComplexNumber x) {
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                this.a[i][j] = x;
            }
        }

    }

    public ComplexMatrix2x2(ComplexNumber x, ComplexNumber y, ComplexNumber z, ComplexNumber w) {
        this.a[0][0] = x;
        this.a[0][1] = y;
        this.a[1][0] = z;
        this.a[1][1] = w;
    }

    public ComplexMatrix2x2 add(ComplexMatrix2x2 cm2) {
        return new ComplexMatrix2x2(this.a[0][0].add(cm2.getA(0, 0)), this.a[0][1].add(cm2.getA(0, 1)),
                this.a[1][0].add(cm2.getA(1, 0)), this.a[1][1].add(cm2.getA(1, 1)));
    }

    public ComplexMatrix2x2 mult(ComplexMatrix2x2 cm2) {
        ComplexNumber c1 = new ComplexNumber(this.a[0][0].mult(cm2.getA(0, 0)).add(this.a[0][1].mult(cm2.getA(1, 0))).getRe(), this.a[0][0].mult(cm2.getA(0, 0)).add(this.a[0][1].mult(cm2.getA(1, 0))).getIm());
        ComplexNumber c2 = new ComplexNumber(this.a[0][0].mult(cm2.getA(0, 1)).add(this.a[0][1].mult(cm2.getA(1, 1))).getRe(), this.a[0][0].mult(cm2.getA(0, 1)).add(this.a[0][1].mult(cm2.getA(1, 1))).getIm());
        ComplexNumber c3 = new ComplexNumber(this.a[1][0].mult(cm2.getA(0, 0)).add(this.a[1][1].mult(cm2.getA(1, 0))).getRe(), this.a[1][0].mult(cm2.getA(0, 0)).add(this.a[1][1].mult(cm2.getA(1, 0))).getIm());
        ComplexNumber c4 = new ComplexNumber(this.a[1][0].mult(cm2.getA(0, 1)).add(this.a[1][1].mult(cm2.getA(1, 1))).getRe(), this.a[1][0].mult(cm2.getA(0, 1)).add(this.a[1][1].mult(cm2.getA(1, 1))).getIm());
        return new ComplexMatrix2x2(c1, c2, c3, c4);
    }

    public ComplexNumber det() {
        return this.a[0][0].mult(this.a[1][1]).sub(this.a[1][0].mult(this.a[0][1]));
    }

    public ComplexVector2D multVector(ComplexVector2D cv) {
        ComplexNumber c1 = new ComplexNumber(this.a[0][0].mult(cv.getCn1()).add(this.a[0][1].mult(cv.getCn2())).getRe(), this.a[0][0].mult(cv.getCn1()).add(this.a[0][1].mult(cv.getCn2())).getIm());
        ComplexNumber c2 = new ComplexNumber(this.a[1][0].mult(cv.getCn1()).add(this.a[1][1].mult(cv.getCn2())).getRe(), this.a[1][0].mult(cv.getCn1()).add(this.a[1][1].mult(cv.getCn2())).getIm());
        ComplexVector2D cv_n = new ComplexVector2D(c1, c2);
        return cv_n;
    }

    public String toString() {
        return this.a[0][0] + " " + this.a[0][1] + "\n" + this.a[1][0] + " " + this.a[1][1];
    }


}