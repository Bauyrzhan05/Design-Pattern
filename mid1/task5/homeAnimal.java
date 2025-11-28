package mid1.task5;

import java.util.ArrayList;
import java.util.List;

// Aggregation
class homeAnimal {
    protected List<animals> animals;

    public homeAnimal() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(animals animal) {
        animals.add(animal);
    }

    public void homeOfAnimals() {
        System.out.println("Homes of animals...");
        for (animals animal : animals) {
            animal.animalsInfo();
        }
    }
}