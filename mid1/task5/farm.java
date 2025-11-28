package mid1.task5;

import java.util.ArrayList;
import java.util.List;

// Composition
class farm {
    protected List<animals> animals;

    public farm() {
        this.animals = new ArrayList<>();

        animals.add(new Dogs());
        animals.add(new Cats());
        animals.add(new Horses());
    }

    public void farmOfAnimals() {
        System.out.println("Farm of animals...");
        for (animals animal : animals) {
            animal.animalsInfo();
        }
    }
}