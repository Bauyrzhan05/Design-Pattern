package Factory;

class LanguageFactory extends Factory {

    public Developer createDeveloper(String type) {
        if (type.equals("java")) {
            return new JavaDeveloper();
        } else if (type.equals("python")) {
            return new PythonDeveloper();
        }
        return null;
    }
}
