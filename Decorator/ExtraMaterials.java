package Decorator;

public class ExtraMaterials extends CourseDecorator {
    Course course;

    public ExtraMaterials(Course course) {
        this.course = course;
    }

    public String getDescription() {
        return course.getDescription() + ", Extra Materials";
    }

    public double cost() {
        return 50000 + course.cost();
    }
}