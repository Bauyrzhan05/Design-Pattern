package mid1.task2;

public class Dogs extends animals {
    String sound;

    Dogs(){}

    Dogs(String name, int height, int weight, String sound){
        super(name, height, weight);
        this.sound = sound;
    }

    public void animalInfo(){
        String dog = name+", "+height+" kg, "+weight+" m, "+sound+"!";
        System.out.println(dog);
    }
}
