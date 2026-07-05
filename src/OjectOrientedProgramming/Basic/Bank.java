package OjectOrientedProgramming.Basic;

/*
Constructor
A constructor is used in the creation of an object.
It is a special type of code block that has a specific name and parameters, much like a method.
It has the same name as the class itself, and it doesn't return any values.
It has no return type, not even void.

Default Constructor - If a class contains no constructor declarations, then a default constructor is implicitly declared at compile time.

*/
public class Bank {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Which constructor is called, determine by the argument that have been passed.

    // This constructor called the argument constructor. why ?
    // In JAVA "this" is a special keyword used for constructor chaining, when we pass arguments inside this(), you are explicitly telling Java: "Before you execute any other line in this constructor, go run the constructor in this same class that matches these exact parameters.
    public Bank() {
        this(0, 0.0, "Default name", "Default email", "000000000");
        System.out.println("Empty constructor called");
    }

    public Bank(int accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void withdraw (double amount){
        if(accountBalance >= amount){
            accountBalance -= amount;
            System.out.println(amount + " have been withdrawal");
        }
    }

    public void deposit (double amount){
        if(amount > 0){
            accountBalance += amount;
            System.out.println(amount + " have been deposited");
        }
    }
}
