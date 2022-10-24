// Then creating a separate class which will take all the
//  abstract properties of Shape Class Method
public class CalculateArea extends Shape {

    @Override
    void RectangularArea(int l, int b) {
        int AreaOfRectangle = (l * b);
        System.out.println(AreaOfRectangle);
    }

    @Override
    void SquareArea(int s) {
        int AreaOfSquare= (s * s);
        System.out.println(AreaOfSquare);
    }

    @Override
    void CircleArea(double r) {
        double AreaOfCircle=  (2 * 3.14 * r * r);
        System.out.println(AreaOfCircle);
    }   
     
}
