package AbstractPractice;

public class Lion extends Feline{
    public Lion(){
        this.setfood("초원 속의 동물");
        this.noise = "어흥";
    }
    public void makeNoise(){
        System.out.println("이 동물은 " + this.noise + "소리를 냅니다.");
    }
    public void eat(){
        System.out.println(this.food + "를 먹습니다.");
    }
}