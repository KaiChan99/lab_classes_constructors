

public class Account {

    private String id;

    private String name;

    private int balance;


    // Constructor
    public Account(String id, String name, int balance) {
this.id = id;
this.name = name;
this.balance = balance;

    }

//    Methods

public String getId() {
        return id;
}

public void setId(String id) {
        this.id = id;
}

public String getName() {
        return name;
}

public void setName(String name){
        this.name = name;
}

public int getBalance(){
        return balance;
}

public void setBalance(int balance){
        this.balance = balance;
}

// Understand this better now
    @Override
    public String toString() {
        return "Account{" + "id='" + id + ", name='" + name + ", balance=" + balance + '}';
    }


}