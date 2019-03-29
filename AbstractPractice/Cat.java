package AbstractPractice;

public class Cat extends Feline{
    public Cat(){
        this.setfood("생선");
        this.noise = "Meow";
    }
    public void makeNoise(){
        System.out.println("이 동물은 " + this.noise + "소리를 냅니다.");
    }
    public void eat(){
        System.out.println(this.food + "를 먹습니다.");
    }
}