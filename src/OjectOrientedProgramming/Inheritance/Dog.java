package OjectOrientedProgramming.Inheritance;

// Dog ---> Animal (Dog "is a" Animal)
public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog() {
        // super(); // It is similar to this(param1, param2, param3,... ) Constructor Chaining, but here we use super to call parent default constructor.
        super("Mutt", "Big", 300.0);
    }

    public Dog (String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
    // Overriding a method is when you create a method on a subclass, which has the same signature as a method on a super class.
    /*
        The Overridden method can do one of three things:
        It can implement completely different behavior, overriding the behavior of the parent.
        It can simply call the parent class's method, which is somewhat redundant to do.
        It can call the parent class's method and include other code to run so it can extend the functionality for subclass, for that behavior.
    */
    public void makeNoise() {

        if(type == "Wolf"){
            System.out.print("Ow Woooooo");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail");
        if(speed == "slow"){
            walk();
            wagTail();
        } else {
            run();
            bark();
        }

    }

    private void bark() {
        System.out.print("Woof! ");
    }

    private void run() {
        System.out.print("Dog Running ");
    }

    private void walk() {
        System.out.print("Dog Walking ");
    }

    private void wagTail() {
        System.out.print("Tail Wagging ");
    }
}
