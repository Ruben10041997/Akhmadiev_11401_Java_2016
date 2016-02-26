package abramskiy.homework003.testing;

import abramskiy.homework003.ComplexMatrix2x2;
import abramskiy.homework003.ComplexNumber;
import abramskiy.homework003.ComplexVector2D;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

/**
 * Created by rubenahmadiev on 25.02.16.
 */
public class TestComplexMatrix2x2 extends Assert {



    @Test
    public void constructorWithOneDoubleValueShouldReturnCorrectValues() {


        ComplexNumber number1 = new ComplexNumber(1.0,1.0);
        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2(number1);

        ComplexNumber a = mock(ComplexNumber.class);
        when(a.getRe()).thenReturn(1.0);
        when(a.getIm()).thenReturn(1.0);
        when(a.equals(anyObject())).thenCallRealMethod();

        assertTrue(matrix1.getA(0,0).equals(a));
        assertTrue(matrix1.getA(0,1).equals(a));
        assertTrue(matrix1.getA(1,0).equals(a));
        assertTrue(matrix1.getA(1,1).equals(a));

    }


    @Test
    public void constructorWithDifferentDoubleValuesShouldReturnCorrectValues() {


        ComplexNumber complex1 = new ComplexNumber(1.0, 1.0);
        ComplexNumber complex2 = new ComplexNumber(1.0, 1.0);
        ComplexNumber complex3 = new ComplexNumber(1.0, 1.0);
        ComplexNumber complex4 = new ComplexNumber(1.0, 1.0);
        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2(complex1, complex2, complex3, complex4);


        ComplexNumber a = mock(ComplexNumber.class);
        when(a.getRe()).thenReturn(1.0);
        when(a.getIm()).thenReturn(1.0);
        when(a.equals(anyObject())).thenCallRealMethod();

        assertTrue(matrix1.getA(0,0).equals(a));
        assertTrue(matrix1.getA(0,1).equals(a));
        assertTrue(matrix1.getA(1,0).equals(a));
        assertTrue(matrix1.getA(1,1).equals(a));

    }



    @Test
    public void getterShouldReturnCorrectValues() {

        ComplexNumber complex1 = mock(ComplexNumber.class);
        when(complex1.getRe()).thenReturn(1.0);
        when(complex1.getIm()).thenReturn(1.0);
        when(complex1.equals(anyObject())).thenCallRealMethod();

        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2(complex1);

        Assert.assertFalse(matrix1.getA(0, 0).equals(complex1));
    }

    @Test
    public void emptyConstructorShouldBeReturnCorrectValues() {

        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2();


        ComplexNumber a = mock(ComplexNumber.class);
        when(a.getRe()).thenReturn(0.0);
        when(a.getIm()).thenReturn(0.0);
        when(a.equals(anyObject())).thenCallRealMethod();




        assertTrue(matrix1.getA(0,0).equals(a));
        assertTrue(matrix1.getA(0,1).equals(a));
        assertTrue(matrix1.getA(1,0).equals(a));
        assertTrue(matrix1.getA(1,1).equals(a));

    }



    @Test
    public void methodShouldBeReturnCorrectSum() {
        ComplexNumber complex1 = new ComplexNumber(1.0,1.0);
        ComplexNumber complex2 = new ComplexNumber(1.0,1.0);
        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2(complex1);
        ComplexMatrix2x2 matrix2 = new ComplexMatrix2x2(complex2);

        ComplexNumber a = mock(ComplexNumber.class);
        when(a.getRe()).thenReturn(2.0);
        when(a.getIm()).thenReturn(2.0);
        when(a.equals(anyObject())).thenCallRealMethod();


        assertTrue(matrix1.add(matrix2).getA(0,0).equals(a));
        assertTrue(matrix1.add(matrix2).getA(0,1).equals(a));
        assertTrue(matrix1.add(matrix2).getA(1,0).equals(a));
        assertTrue(matrix1.add(matrix2).getA(1,1).equals(a));
    }

    @Test
    public void methodShouldBeReturnCorrectMulty() {
        ComplexNumber complex1 = new ComplexNumber(1.0,1.0);
        ComplexNumber complex2 = new ComplexNumber(1.0,1.0);
        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2(complex1);
        ComplexMatrix2x2 matrix2 = new ComplexMatrix2x2(complex2);

        ComplexNumber a = mock(ComplexNumber.class);
        when(a.getRe()).thenReturn(0.0);
        when(a.getIm()).thenReturn(4.0);
        when(a.equals(anyObject())).thenCallRealMethod();


        assertTrue(matrix1.mult(matrix2).getA(0,0).equals(a));
        assertTrue(matrix1.mult(matrix2).getA(0,1).equals(a));
        assertTrue(matrix1.mult(matrix2).getA(1,0).equals(a));
        assertTrue(matrix1.mult(matrix2).getA(1,1).equals(a));
    }

    @Test
    public void methodShouldBeReturnCorrectDetermine() {
        ComplexNumber complex1 = new ComplexNumber(1.0, 1.0);
        ComplexNumber complex2 = new ComplexNumber(2.0, 2.0);
        ComplexNumber complex3 = new ComplexNumber(3.0, 3.0);
        ComplexNumber complex4 = new ComplexNumber(4.0, 4.0);

        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2(complex1, complex2, complex3, complex4);


        ComplexNumber a = mock(ComplexNumber.class);
        when(a.getRe()).thenReturn(0.0);
        when(a.getIm()).thenReturn(-4.0);
        when(a.equals(anyObject())).thenCallRealMethod();

        assertTrue((matrix1.getA(0,0).mult(matrix1.getA(1,1))).sub(matrix1.getA(1,0).mult(matrix1.getA(0,1))).equals(a));

    }

    @Test
    public void methodShouldBeReturnString() {
        ComplexNumber complex1 = new ComplexNumber(1.1, 2.2);
        ComplexNumber complex2 = new ComplexNumber(1.1, 2.2);
        ComplexNumber complex3 = new ComplexNumber(1.1, 2.2);
        ComplexNumber complex4 = new ComplexNumber(1.1, 2.2);

        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2(complex1, complex2, complex3, complex4);

        assertTrue(matrix1.toString().equals("1.1 + 2.2 * i 1.1 + 2.2 * i\n1.1 + 2.2 * i 1.1 + 2.2 * i"));


    }

    @Test
    public void methodShouldBeReturnCorrectMatrixVector() {
        ComplexNumber complex1 = new ComplexNumber(1.0, 1.0);
        ComplexNumber complex2 = new ComplexNumber(1.0, 1.0);
        ComplexNumber complex3 = new ComplexNumber(1.0, 1.0);
        ComplexNumber complex4 = new ComplexNumber(1.0, 1.0);
        ComplexNumber complex5 = new ComplexNumber(0.0, 4.0);
        ComplexNumber complex6 = new ComplexNumber(0.0, 4.0);

        ComplexVector2D vector1 = new ComplexVector2D(complex1, complex2);
        ComplexVector2D vector2 = new ComplexVector2D(complex5, complex6);

        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2(complex1, complex2, complex3, complex4);


        ComplexVector2D a = mock(ComplexVector2D.class);
        when(a.getCn1()).thenReturn(complex5);
        when(a.getCn2()).thenReturn(complex6);
        when(a.equals(anyObject())).thenCallRealMethod();

        assertTrue(matrix1.multVector(vector1).equals(a));


    }


}
