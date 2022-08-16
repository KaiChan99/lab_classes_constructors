

public class Customer {

    private int id;

    private String firstName;

    private String lastName;

    private double heldMoney;

    public Customer(String firstName, String lastName, double heldMoney) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.heldMoney = heldMoney;
        this.id = (int) (Math.random() * 1000 + 1); // can't get 1001 because generates [0,1)


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHeldMoney() {
        return heldMoney;
    }

    public void setHeldMoney(double heldMoney) {
        this.heldMoney = heldMoney;
    }

    public String getFullName() {
        return (firstName + " " + lastName);
    }

    public void subtractHeldMoney(double deduction) {
        setHeldMoney(heldMoney - deduction);

    }

    // Get used to language structure/format
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", heldMoney=" + heldMoney +
                '}';


    }
}


