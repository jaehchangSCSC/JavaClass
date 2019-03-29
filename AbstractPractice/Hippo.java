package AbstractPractice;

public class Hippo extends Animal{
    public Hippo(){
        this.setfood("Grass");
        this.noise = "으어어어";
    }
    public void roam(){
        System.out.println("천천히 느리게");
    }
    public void makeNoise(){
        System.out.println("이 동물은 " + this.noise + "소리를 냅니다.");
    }
    public void eat(){
        System.out.println(this.food + "를 먹습니다.");
    }
}