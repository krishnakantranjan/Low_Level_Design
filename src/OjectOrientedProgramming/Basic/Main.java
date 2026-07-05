package OjectOrientedProgramming.Basic;

/*
Getter and Setters
A getter is a method on a class that retrieves the value of a private field and return it.
A setter is a method on a class that sets the value of a private field.
The purpose of these methods is to control and protect access to private fields.
This provides encapsulation of the internal of class
*/
public class Main {
    static void main(String[] args) {
//        Car car = new Car();
//        car.setMake("Porsche");
//        car.setColor("Black");
//        car.setDoors(2);
//        car.setModel("Carrera");
//        car.setConvertible(true);
//        car.describeCar();
//
//        System.out.println("make = " + car.getMake());

        StaticVsInstance s1 = new StaticVsInstance("krishna");
        StaticVsInstance s2 = new StaticVsInstance("ranjan");
        StaticVsInstance s3 = new StaticVsInstance("kant");

        s1.printName();
        s2.printName();
    }
}
