package AbstractPractice;

public class Dog extends Canine{
    public Dog(){
        this.setfood("고기");
        this.noise = "멍멍";
    }
    public void makeNoise(){
        System.out.println("이 동물은 " + this.noise + "소리를 냅니다.");
    }
    public void eat(){
        System.out.println(this.food + "를 먹습니다.");
    }
}