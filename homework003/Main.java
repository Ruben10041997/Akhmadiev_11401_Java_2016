package abramskiy.homework003;

import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by rubenahmadiev on 25.02.16.
 */
public class Main {
    public static void main(String[] args) {
        ComplexNumber complex1 = new ComplexNumber(1.0,1.0);
        ComplexNumber complex2 = new ComplexNumber(1.0,1.0);
        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2(complex1);
        ComplexMatrix2x2 matrix2 = new ComplexMatrix2x2(complex2);
        System.out.println(matrix1.add(matrix2));
        ComplexNumber a = mock(ComplexNumber.class);
        when(a.getRe()).thenReturn(2.0);
        when(a.getIm()).thenReturn(2.0);
        when(a.equals(anyObject())).thenCallRealMethod();
        System.out.println(a);
        System.out.println(matrix2.toString());
    }
}
