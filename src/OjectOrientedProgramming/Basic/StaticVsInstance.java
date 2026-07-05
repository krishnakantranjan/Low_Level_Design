package OjectOrientedProgramming.Basic;

/*
Static Variables are also known as static member variables.
Every instance of the class shares the same static variable.


Instance Variable don't use static keyword.
They are also known as fields or member variables.
Instance variables belong to a specific instance of a class.


Instance vs Object
Object X is an instance of Class Y,
*/
public class StaticVsInstance {
    private static String name;

    public StaticVsInstance(String name){
        StaticVsInstance.name = name;
    }

    public void printName() {
        System.out.println(name);
    }
}
