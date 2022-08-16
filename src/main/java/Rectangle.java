public class Rectangle {

    double length;

    double width;


//    Constructor

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }


//    Methods


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

//    Perimeter
    public double getPerimeter(){
        return (2 * length + 2 * width);
    }

//    Area
    public double getArea() {
        return (length * width);
    }

//    getDiagonal
    public double getDiagonal() {
        return ();
    }
}
