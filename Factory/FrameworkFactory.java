package Factory;

class FrameworkFactory extends Factory {
    public Developer createDeveloper(String type) {
        if (type.equals("django")) {
            return new PythonDjango();
        } else if (type.equals("spring")) {
            return new JavaSpring();
        }
        return null;
    }
}