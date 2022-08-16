public class Main {

    public static void main(String[] args) {

//        Account

        Account myAccount = new Account("1", "Johnson", 300);

        int myBalance = myAccount.getBalance();

        System.out.println(myBalance);
        System.out.println(myAccount);


//        Circle

        Circle myCircle = new Circle(10);

        System.out.println("radius = "+myCircle.getRadius());
        System.out.println("circumference = "+myCircle.getCircumference());

        myCircle.setRadius(20);

        System.out.println("radius = "+myCircle.getRadius());
        System.out.println("circumference = "+myCircle.getCircumference());


//        Rectangle

        Rectangle myRectangle = new Rectangle(10,20);

        System.out.println("Perimeter of Rectangle " +myRectangle.getPerimeter());
        System.out.println("Area of Rectangle " +myRectangle.getArea());
        System.out.println("Diagonal of Rectangle " +myRectangle.getDiagonal());

//        Customer Example



    }



}
