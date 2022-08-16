

public class Circle {

    private double radius;

    private double circumference;


    // Constructor
    public Circle(double radius) {
        this.radius = radius;
//        this.circumference = circumference;
    }

// Methods

    public double getRadius() {
        return radius;
    }

   public void setRadius(double newRadius) {   // Setting a new various from MAIN
        this.radius = newRadius;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }
}

//    @Override
//    public String toString() {
//        return "Circle{" + "radius' " + radius;  };
//    }


