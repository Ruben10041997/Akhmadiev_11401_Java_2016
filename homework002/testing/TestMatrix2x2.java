package abramskiy.homework002.testing;

import abramskiy.Vector2D;
import abramskiy.homework002.Matrix2x2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.math.*;

/**
 * Created by rubenahmadiev on 23.02.16.
 */
public class TestMatrix2x2 extends Assert {

    int a=2,b=2;
    double d = 10.0;
    double[][] mass1 = new double[a][b];
    double[][] mass2 = new double[a][b];
    double d1,d2,d3,d4;

    public void transp() {
        double a = mass1[1][0];
        mass1[1][0] = mass1[0][1];
        mass1[0][1] = a;
    }
    public double det() {
        return mass1[0][0] * mass1[1][1] - mass1[0][1] * mass1[1][0];
    }

    @Before
    public void fillMassiveMass() {
        mass1[0][0] = 11.1;
        mass1[0][1] = 22.2;
        mass1[1][0] = 33.3;
        mass1[1][1] = 44.4;
        mass2[0][0] = 1.1;
        mass2[0][1] = 2.2;
        mass2[1][0] = 3.3;
        mass2[1][1] = 4.4;
        d1 = 5.5;
        d2 = 6.6;
        d3 = 7.7;
        d4 = 8.8;
    }



    @Before
    public void fillMassiveM() {
        Matrix2x2 m1 = new Matrix2x2(mass1);
        Matrix2x2 m2 = new Matrix2x2(mass2);
        m1.mContent[0][0] = mass1[0][0];
        m1.mContent[0][1] = mass1[0][1];
        m1.mContent[1][0] = mass1[1][0];
        m1.mContent[1][1] = mass1[1][1];
        m2.mContent[0][0] = mass2[0][0];
        m2.mContent[0][1] = mass2[0][1];
        m2.mContent[1][0] = mass2[1][0];
        m2.mContent[1][1] = mass2[1][1];
    }

    @Test
    public void constructorMustReturnEmptyMatrix2x2() {
    Matrix2x2 m = new Matrix2x2();
    for (int i=0; i<a; i++){
        for (int j=0; j<b; j++){
            assertEquals(0, m.mContent[i][j], 1e-9);
        }
    }
    System.out.println("Это нулевая матрица");

}

    @Test
    public void constructorMustReturnMatrix2x2ContainsOneDoubleValues() {
        Matrix2x2 m = new Matrix2x2(d);
        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                assertEquals(d, m.mContent[i][j], 1e-9);
            }
        }
        System.out.println("Это матрица, у которой каждый элемент равен поданному числу d");

    }

    @Test
    public void constructorMustBeReturnMatrix2x2WithThisDoubleValues() {
      fillMassiveM();
      mass1[0][0] = d1;
      mass1[0][1] = d2;
      mass1[1][0] = d3;
      mass1[1][1] = d4;
        System.out.println("Всё на своих местах");
    }

    @Test
    public void methodMustBeSummarizeMatrixsCorrect() {
        fillMassiveM();
        assertEquals(12.2, mass1[0][0]+mass2[0][0], 1e-9);
        assertEquals(24.4, mass1[0][1]+mass2[0][1], 1e-9);
        assertEquals(36.6, mass1[1][0]+mass2[1][0], 1e-9);
        assertEquals(48.8, mass1[1][1]+mass2[1][1], 1e-9);
        System.out.println("Суммирование прошло успешно");

    }

    @Test
    public void methodMustBeExctractingMatrixsCorrect() {
        fillMassiveM();
        assertEquals(10.0, mass1[0][0]-mass2[0][0], 1e-9);
        assertEquals(20.0, mass1[0][1]-mass2[0][1], 1e-9);
        assertEquals(30.0, mass1[1][0]-mass2[1][0], 1e-9);
        assertEquals(40.0, mass1[1][1]-mass2[1][1], 1e-9);
        System.out.println("Вычитание прошло успешно");
    }

    @Test
    public void methodMustBeMultiOnNumberMatrixsCorrect() {
        fillMassiveM();
        assertEquals(111.0, mass1[0][0]*d, 1e-9);
        assertEquals(222.0, mass1[0][1]*d, 1e-9);
        assertEquals(333.0, mass1[1][0]*d, 1e-9);
        assertEquals(444.0, mass1[1][1]*d, 1e-9);
        System.out.println("Умножение на число прошло успешно");
    }

    @Test
    public void methodMustBeMultiMatrixsCorrect() {
        fillMassiveM();
        double a = this.mass1[0][0];
        double b = this.mass1[0][1];
        double c = this.mass1[1][0];
        double d = this.mass1[1][1];
        assertEquals(85.47, a * mass2[0][0] + b * mass2[1][0], 1e-9);
        assertEquals(122.10000000000001, a * mass2[0][1] + b * mass2[1][1], 1e-9);
        assertEquals(183.14999999999998, c * mass2[0][0] + d * mass2[1][0], 1e-9);
        assertEquals(268.62, c * mass2[0][1] + d * mass2[1][1], 1e-9);
        System.out.println("Умножение прошло успешно");

    }

    @Test
    public void methodMustFindDetCorrect() {
        fillMassiveM();
        double det;
        det = mass1[0][0] * mass1[1][1] - mass1[0][1] * mass1[1][0];
        assertEquals(-246.4199999999999, det, 1e-9);
        System.out.println("Определитель нашёлся");
    }

    @Test
    public void methodMustBeTransponMatrixCorrect() {
        fillMassiveM();
        double a = this.mass1[1][0];
        this.mass1[1][0] = this.mass1[0][1];
        this.mass1[0][1] = a;
        assertEquals(33.3, a, 1e-9);
        System.out.println("Транспонирование прошло успешно");
    }

    @Test
    public void methodMustBeInverseMatrixCorrect() {
        fillMassiveM();
        double g = this.det();
        if (g == 0) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    this.mass1[i][j] = 0;
                }
            }
            System.out.println("det = 0");
        } else {
            this.transp();
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    this.mass1[i][j] *= 1 / g;                }
            }
        }
        assertEquals(-0.045045045045045064, mass1[0][0], 1e-9);
        assertEquals(-0.1351351351351352, mass1[0][1], 1e-9);
        assertEquals(-0.09009009009009013, mass1[1][0], 1e-9);
        assertEquals(-0.18018018018018025, mass1[1][1], 1e-9);
        System.out.println("Обратная матрица найдена успешно");
    }

    @Test
    public void methodMustBуGetEquivalentDiagonalFromMatrixs() {
        fillMassiveM();
        double a = this.mass1[0][0];
        double b = this.mass1[0][1];
        double c = this.mass1[1][0];
        for (int j = 0; j < 2; j++) {
            this.mass1[0][j] *= c;
            this.mass1[1][j] *= a;
        }
        for (int j = 0; j < 2; j++) {
            this.mass1[1][j] -= this.mass1[0][j];
        }
        this.mass1[0][0] = a;
        this.mass1[0][1] = b;
        double d = this.mass1[1][1];
        for (int j = 0; j < 2; j++) {
            this.mass1[0][j] *= d;
            this.mass1[1][j] *= b;
        }
        for (int j = 0; j < 2; j++) {
            this.mass1[0][j] -= this.mass1[1][j];        }

        assertEquals(-2735.261999999999, mass1[0][0], 1e-9);
        assertEquals(0.0, mass1[0][1], 1e-9);
        assertEquals(0.0, mass1[1][0], 1e-9);
        assertEquals(-5470.523999999998, mass1[1][1], 1e-9);
        System.out.println("Эквивалентная диагональная матрица возвращена успешно");
    }

    @Test
    public void methodShouldBeMultOnVectorCorrect() {
       fillMassiveMass();
        Vector2D v = new Vector2D(d1,d2);
        double c1 = mass1[0][0] * v.getX() + mass1[0][1] * v.getY();
        double c2 = mass1[1][0] * v.getX() + mass1[1][1] * v.getY();
        Vector2D myVector = new Vector2D(c1, c2);
        assertEquals(207.57, c1 ,1e-9);
        assertEquals(476.18999999999994, c2 ,1e-9);
        System.out.println("Умножение на вектор прошло успешно");

    }




}
