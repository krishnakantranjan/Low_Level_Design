package OjectOrientedProgramming.Basic;

public class CustomerClassChallenge {
    static void main(String[] args) {

        Customer c1 = new Customer();
        System.out.println(c1.getName());
        System.out.println(c1.getCreditLimit());
        System.out.println(c1.getEmailAddress());

        Customer c2 = new Customer("Krishna", "krishna@gmail.com");
        System.out.println(c2.getCreditLimit());
    }
}
