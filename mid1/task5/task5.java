package mid1.task5;

public class task5 {
    public static void main(String[] args) {

        // Aggregation
        homeAnimal home = new homeAnimal();
        home.addAnimal(new Cats());
        home.addAnimal(new Horses());
        home.addAnimal(new Dogs());
        home.homeOfAnimals();

        // Composition
        farm farm = new farm();
        farm.farmOfAnimals();

        // Association
        System.out.println("Animals born:");
        bornAnimal born1 = new bornAnimal("USE");
        bornAnimal born2 = new bornAnimal("UK");
        bornAnimal born3 = new bornAnimal("KAZ");
        Dogs dog = new Dogs();
        Horses horse = new Horses();
        Cats cat = new Cats();

        dog.bornAnimal(born1);
        cat.bornAnimal(born2);
        horse.bornAnimal(born3);


    }
}
