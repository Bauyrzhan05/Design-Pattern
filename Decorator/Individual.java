package Decorator;

public class Individual extends CourseDecorator {
    Course course;

    public Individual(Course course) {
        this.course = course;
    }

    public String getDescription() {
        return course.getDescription() + ", Individual";
    }

    public double cost() {
        return 80000 + course.cost();
    }
}