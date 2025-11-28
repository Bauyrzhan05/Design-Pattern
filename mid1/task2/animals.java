package mid1.task2;

abstract class animals {
    String name;
    int height;
    int weight;

    animals(){}

    animals(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public abstract void animalInfo();

}


