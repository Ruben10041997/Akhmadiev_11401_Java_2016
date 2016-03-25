package homework009.testing;

import homework009.ComplexMatrix2x2;
import homework009.ComplexNumber;
import homework009.ComplexVector2D;
import homework009.SpringConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.*;

/**
 * Created by rubenahmadiev on 25.02.16.
 */
public class TestComplexMatrix2x2 extends Assert {

    ComplexMatrix2x2 cm1;
    ComplexMatrix2x2 cm2;
    ComplexNumber cn1;
    ComplexNumber cn2;
    ComplexNumber cn3;
    ComplexNumber cn4;
    ComplexNumber cn5;
    ComplexVector2D cv1;

    @Before
    public void setUp() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        cm1 = ac.getBean(ComplexMatrix2x2.class);
        cn1 = (ComplexNumber) ac.getBean("complexNumberOne");
        cn2 = (ComplexNumber) ac.getBean("complexNumberTwo");
        cn3 = (ComplexNumber) ac.getBean("complexNumberZeroFour");
        cn4 = (ComplexNumber) ac.getBean("complexNumberZeroMinusFour");
        cn5 = (ComplexNumber) ac.getBean("complexNumberZero");
        cv1 = (ComplexVector2D) ac.getBean("complexVector2D");
    }


    @Test
    public void constructorWithOneDoubleValueShouldReturnCorrectValues() {

        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        ComplexNumber number1 = new ComplexNumber(1.0, 1.0);
        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2(number1);


        assertTrue(matrix1.getA(0, 0).equals(cn1));
        assertTrue(matrix1.getA(0, 1).equals(cn1));
        assertTrue(matrix1.getA(1, 0).equals(cn1));
        assertTrue(matrix1.getA(1, 1).equals(cn1));

    }


    @Test
    public void constructorWithDifferentDoubleValuesShouldReturnCorrectValues() {


        ComplexNumber complex1 = new ComplexNumber(1.0, 1.0);
        ComplexNumber complex2 = new ComplexNumber(1.0, 1.0);
        ComplexNumber complex3 = new ComplexNumber(1.0, 1.0);
        ComplexNumber complex4 = new ComplexNumber(1.0, 1.0);
        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2(complex1, complex2, complex3, complex4);

        assertTrue(matrix1.getA(0, 0).equals(cn1));
        assertTrue(matrix1.getA(0, 1).equals(cn1));
        assertTrue(matrix1.getA(1, 0).equals(cn1));
        assertTrue(matrix1.getA(1, 1).equals(cn1));

    }


    @Test
    public void getterShouldReturnCorrectValues() {


        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2(cn1);

        Assert.assertTrue(matrix1.getA(0, 0).equals(cn1));
    }

    @Test
    public void emptyConstructorShouldBeReturnCorrectValues() {

        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2();

        assertTrue(matrix1.getA(0, 0).equals(cn5));
        assertTrue(matrix1.getA(0, 1).equals(cn5));
        assertTrue(matrix1.getA(1, 0).equals(cn5));
        assertTrue(matrix1.getA(1, 1).equals(cn5));

    }


    @Test
    public void methodShouldBeReturnCorrectSum() {
        ComplexNumber complex1 = new ComplexNumber(1.0, 1.0);
        ComplexNumber complex2 = new ComplexNumber(1.0, 1.0);
        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2(complex1);
        ComplexMatrix2x2 matrix2 = new ComplexMatrix2x2(complex2);

        assertTrue(matrix1.add(matrix2).getA(0, 0).equals(cn2));
        assertTrue(matrix1.add(matrix2).getA(0, 1).equals(cn2));
        assertTrue(matrix1.add(matrix2).getA(1, 0).equals(cn2));
        assertTrue(matrix1.add(matrix2).getA(1, 1).equals(cn2));
    }

    @Test
    public void methodShouldBeReturnCorrectMulty() {
        ComplexNumber complex1 = new ComplexNumber(1.0, 1.0);
        ComplexNumber complex2 = new ComplexNumber(1.0, 1.0);
        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2(complex1);
        ComplexMatrix2x2 matrix2 = new ComplexMatrix2x2(complex2);


        assertTrue(matrix1.mult(matrix2).getA(0, 0).equals(cn3));
        assertTrue(matrix1.mult(matrix2).getA(0, 1).equals(cn3));
        assertTrue(matrix1.mult(matrix2).getA(1, 0).equals(cn3));
        assertTrue(matrix1.mult(matrix2).getA(1, 1).equals(cn3));
    }

    @Test
    public void methodShouldBeReturnCorrectDetermine() {
        ComplexNumber complex1 = new ComplexNumber(1.0, 1.0);
        ComplexNumber complex2 = new ComplexNumber(2.0, 2.0);
        ComplexNumber complex3 = new ComplexNumber(3.0, 3.0);
        ComplexNumber complex4 = new ComplexNumber(4.0, 4.0);

        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2(complex1, complex2, complex3, complex4);

        assertTrue((matrix1.getA(0, 0).mult(matrix1.getA(1, 1))).sub(matrix1.getA(1, 0).mult(matrix1.getA(0, 1))).equals(cn4));

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

        ComplexVector2D vector1 = new ComplexVector2D(complex1, complex2);

        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2(complex1, complex2, complex3, complex4);

        assertTrue(matrix1.multVector(vector1).equals(cv1));


    }


}
