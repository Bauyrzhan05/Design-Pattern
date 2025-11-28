package Decorator;

public class PythonCourse extends Course {
    public PythonCourse() {
        description = "Python Beginner Course";
    }

    public double cost() {
        return 300000;
    }
}