 /* Write the class RightTriangle. The fields of the class
  * are integers which represent the sides of the triangle.
  * Name the fields a,b and c where a and b are the legs of
  * the triangle and c is the hypotenuse. Each of the fields
  * should be private since it makes no sense for the side
  * lengths to be negative. Write three constructors. The first
  * is a default (no argument) constructor in which each field
  * is initialized to an appropriate value. Second, write an
  * argument constructor which receives all three sides of
  * the triangle in order. Again, make sure they are appropriate
  * values. The third, write a copy constructor. Then write the
  * setters and getters for each field.
  */

public class RightTriangle {
    private int a;
    private int b;
    private int c;
    public RightTriangle() {
        a = 3;
        b = 4;
        c = 5;
    }
    public RightTriangle(int a,int b, int c) {
        if ( a  > 0)
            this.a = a;
        if ( b  > 0)
            this.b = b;
        if ( c  > 0)
            this.c = c;
    }
    public RightTriangle(RightTriangle tri) {
        a = tri.getA();
        b = tri.getB();
        c = tri.getC();
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        if (a > 0)
        this.a = a;
    }

    public void setB(int b) {
        if (b > 0)
        this.b = b;
    }

    public void setC(int c) {
        if (c > 0)
        this.c = c;
    }
}
