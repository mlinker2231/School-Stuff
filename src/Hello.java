public class Hello {
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
        public static void main(String args[]){
            RightTriangle r = new RightTriangle();
            RightTriangle s	= new RightTriangle(3,4,5);
            RightTriangle t = new RightTriangle(s);

            t.setA(5);
            System.out.println( "A = " + t.getA() );

            t.setB(12);
            System.out.println( "B = " + t.getB() );

            t.setC(13);
            System.out.println( "C = " + t.getC() );
        }
    }

