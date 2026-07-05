package OjectOrientedProgramming.Basic;

import java.util.Locale;

/*
this - it refers to is the instance that was created when the object was instantiated.
S0, this is a special reference name for the object or instance, which it can use to describe itself.
And we can use this to access fields on the class
*/
public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Grey";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setMake(String make) {
        if(make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "ferrari", "porsche", "tesla", "lamborgini" -> this.make = make;
            default ->
                this.make = "Unsupported";
        }
    }

    public void describeCar() {
        System.out.println(make + model + color + doors + convertible);
    }
}
