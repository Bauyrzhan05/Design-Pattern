package mid1.task2;

public class Cats extends animals {
    String sound;

    Cats(){}

    Cats(String name, int height, int weight, String sound){
        super(name, height, weight);
        this.sound = sound;
    }

    public void animalInfo(){
        String cat = name+", "+height+" kg, "+weight+" m, "+sound+"!";
        System.out.println(cat);
    }
}
