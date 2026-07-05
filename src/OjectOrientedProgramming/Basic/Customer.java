package OjectOrientedProgramming.Basic;

public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer() {
        this("Default Name", 100000.0, "abc@email.com");
        System.out.println("Empty constructor called");
    }

    public Customer(String name, String emailAddress){
        this(name, 200000.0, emailAddress);
    }
    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
