package mid1.task2;

public class task2 {
    public static void main(String[] args) {
        Dogs dog = new Dogs("dog", 32, 43, "gaf");
        Cats cat = new Cats("cat", 7, 23, "miau");
        Horses horse = new Horses("horse", 348, 201, "yyy");

        dog.animalInfo();
        cat.animalInfo();
        horse.animalInfo();
    }
}
