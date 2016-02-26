package abramskiy.homework002;

import abramskiy.Vector2D;

/**
 * Created by rubenahmadiev on 23.02.16.
 */
public class Matrix2x2 {

    int a=2,b=2,i,j,x,y;
   public double [][] mContent = new double [a][b];
    double d;

    public double getD() {
        return d;
    }

    public Matrix2x2() {
        this(0.0);
    }

    public Matrix2x2(double d) {
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                this.mContent[i][j] = d;
            }
        }
    }

    public Matrix2x2(double [][] mas) {
        this.mContent[0][0] = mContent[0][0];
        this.mContent[0][1] = mContent[0][1];
        this.mContent[1][0] = mContent[1][0];
        this.mContent[1][1] = mContent[1][1];
    }





        public void add(Matrix2x2 mass1) {
            for (i = 0; i < a; i++) {
                for (j = 0; j < b; j++) {
                  this.mContent[i][j]+=mass1.mContent[i][j];
                }
            }

        }


    public void sub(Matrix2x2 mass1) {
            for (i = 0; i < a; i++) {
                for (j = 0; j < b; j++) {
                  this.mContent[i][j]-=mass1.mContent[i][j];
                }
            }

        }

    public void multiOnValue(double d) {
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                this.mContent[i][j] *= d;
            }
        }
    }


        public void mult(Matrix2x2 mass1) {
            double a = this.mContent[0][0];
            double b = this.mContent[0][1];
            double c = this.mContent[1][0];
            double r = this.mContent[1][1];
            this.mContent[0][0] = a * mass1.mContent[0][0] + b * mass1.mContent[1][0];
            this.mContent[0][1] = a * mass1.mContent[0][1] + b * mass1.mContent[1][1];
            this.mContent[1][0] = c * mass1.mContent[0][0] + r * mass1.mContent[1][0];
            this.mContent[1][1] = c * mass1.mContent[0][1] + r * mass1.mContent[1][1];
        }

    public double det() {
        return this.mContent[0][0] * this.mContent[1][1] - this.mContent[0][1] * this.mContent[1][0];
    }


    public void transp() {
        double a = this.mContent[1][0];
        this.mContent[1][0] = this.mContent[0][1];
        this.mContent[0][1] = a;
    }

    public Matrix2x2 inverseMatrix() {
        double g = this.det();
        if (g == 0) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    this.mContent[i][j] = 0;
                }
            }
            System.out.println("det = 0");
        } else {
            this.transp();
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    this.mContent[i][j] *= 1 / g;
                }
            }
        }
        return this;
    }

    public Matrix2x2 equivalentDiagonal() {
        double a = this.mContent[0][0];
        double b = this.mContent[0][1];
        double c = this.mContent[1][0];
        for (int j = 0; j < 2; j++) {
            this.mContent[0][j] *= c;
            this.mContent[1][j] *= a;
        }
        for (int j = 0; j < 2; j++) {
            this.mContent[1][j] -= this.mContent[0][j];
        }
        this.mContent[0][0] = a;
        this.mContent[0][1] = b;
        double d = this.mContent[1][1];
        for (int j = 0; j < 2; j++) {
            this.mContent[0][j] *= d;
            this.mContent[1][j] *= b;
        }
        for (int j = 0; j < 2; j++) {
            this.mContent[0][j] -= this.mContent[1][j];
        }
        return this;
    }


    public Vector2D multVector(Vector2D v) {
        double c1 = this.mContent[0][0] * v.getX() + this.mContent[0][1] * v.getY();
        double c2 = this.mContent[1][0] * v.getX() + this.mContent[1][1] * v.getY();
        Vector2D myVector = new Vector2D(c1, c2);
        return myVector;
    }







    }











