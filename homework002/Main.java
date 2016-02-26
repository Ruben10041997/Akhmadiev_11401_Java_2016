package abramskiy.homework002;

/**
 * Created by rubenahmadiev on 23.02.16.
 */
public class Main {
    public static void main(String[] args) {
        int i,j,a=2,b=2;
        Matrix2x2 m1 = new Matrix2x2(9.4);
        Matrix2x2 m2 = new Matrix2x2(1.4);
        m1.add(m2);
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                System.out.println(m1.mContent[i][j]);
            }
        }

    }
}
