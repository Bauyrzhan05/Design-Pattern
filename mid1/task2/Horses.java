package mid1.task2;

public class Horses extends animals {
    String sound;

    Horses(){}

    Horses(String name, int height, int weight, String sound){
        super(name, height, weight);
        this.sound = sound;
    }

    public void animalInfo(){
        String horse = name+", "+height+" kg, "+weight+" m, "+sound+"!";
        System.out.println(horse);
    }

}
