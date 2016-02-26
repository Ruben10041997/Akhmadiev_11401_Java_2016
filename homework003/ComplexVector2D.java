package abramskiy.homework003;

/**
 * Created by rubenahmadiev on 26.02.16.
 */
public class ComplexVector2D {
    private ComplexNumber cn1;
    private ComplexNumber cn2;

    public ComplexNumber getCn1() {
        return this.cn1;
    }

    public ComplexNumber getCn2() {
        return this.cn2;
    }

    public ComplexVector2D() {
        this(new ComplexNumber(), new ComplexNumber());
    }

    public ComplexVector2D(ComplexNumber cn1, ComplexNumber cn2) {
        this.cn1 = cn1;
        this.cn2 = cn2;
    }

    public ComplexVector2D add(ComplexVector2D cv2) {
        ComplexVector2D cv_sum = new ComplexVector2D(this.cn1.add(cv2.getCn1()), this.cn2.add(cv2.getCn2()));
        return cv_sum;
    }

    public String toString() {
        return "(" + this.cn1.toString() + ", " + this.cn2.toString() + ")";
    }

    public ComplexNumber scalarProduct(ComplexVector2D cv2) {
        return this.cn1.mult(cv2.getCn1()).add(this.cn2.mult(cv2.getCn2()));
    }

    public boolean equals(ComplexVector2D cv2) {
        return this.cn1.equals(cv2.getCn1()) && this.cn2.equals(cv2.getCn2());
    }
}
