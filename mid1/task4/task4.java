package mid1.task4;

public class task4 {
    public static void main(String[] args) {

        Dogs dog = new Dogs();
        Cats cat = new Cats();
        Horses horse = new Horses();

        veterinarian vet = new veterinarian();

        vet.checkAnimal(dog);
        vet.checkAnimal(cat);
        vet.checkAnimal(horse);

    }
}
