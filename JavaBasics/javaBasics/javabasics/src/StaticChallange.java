import static_files.Rectangle;

public class StaticChallange {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5.0, 10.0);
        Rectangle rectangle2 = new Rectangle(3.0, 7.0);
        Rectangle rectangle3 = new Rectangle(8.0, 12.0);

        System.out.println("Rectangle 1 Area: " + rectangle1.getArea());
        System.out.println("Rectangle 1 Perimeter: " + rectangle1.getPerimeter());
        System.out.println("Rectangle 1 Number of Rectangles Created: " + rectangle1.getNumOfRectangles());

        System.out.println("Rectangle 2 Area: " + rectangle2.getArea());
        System.out.println("Rectangle 2 Perimeter: " + rectangle2.getPerimeter());
        System.out.println("Rectangle 2 Number of Rectangles Created: " + rectangle2.getNumOfRectangles());

        System.out.println("Rectangle 3 Area: " + rectangle3.getArea());
        System.out.println("Rectangle 3 Perimeter: " + rectangle3.getPerimeter());
        System.out.println("Rectangle 3 Number of Rectangles Created: " + rectangle3.getNumOfRectangles());
    }

}
