package static files;

public class Rectangle {
    public int width;
    public int height;
    //if you dont use the static keyword for the number
    // the logic will work but each instance of the Rectangle
    // would have its own number variable, this means that the count of rectangles would be specific to each individual object

    public static int number = 0;

    public Rectangle(double d, double e){
        this.width = d;
        this.height = e;
        number++;

    }
    public static int nomOfRectangles(){
       //this.number += 1;
        return number;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
    
    
}
