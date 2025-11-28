package Decorator;

public abstract class Course {
    String description = "";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
