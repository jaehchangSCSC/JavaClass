package AbstractPractice;

public class TestingAbstract{
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals [0] = new Dog("Corki");
        animals [1] = new Cat("Azir");
        animals [2] = new Lion("Rengar");
        animals [3] = new Hippo("Maokai");
        for (int i = 0; i < animals.length; i++){
            animals[i].eat();
            animals[i].makeNoise();
            animals[i].wakeup();
            animals[i].sleep();
            animals[i].eat();
            animals[i].makeNoise();
            animals[i].wakeup();
            animals[i].eat();
            animals[i].makeNoise();
            System.out.println();
        }
    }
}