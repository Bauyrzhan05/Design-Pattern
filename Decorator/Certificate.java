package Decorator;

public class Certificate extends CourseDecorator {
    Course course;

    public Certificate(Course course) {
        this.course = course;
    }

    public String getDescription() {
        return course.getDescription() + ", Certificate";
    }

    public double cost() {
        return 30000 + course.cost();
    }
}
