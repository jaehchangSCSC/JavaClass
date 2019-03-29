package AbstractPractice;

public class Hippo extends Animal{
    public Hippo(String newName){
        this.setfood("Grass");
        this.noise = "으어어어";
        this.name = newName;
    }
    //abstract 구체화
    public void roam(){
        System.out.println("천천히 느리게");
    }
    public void attack(){
        System.out.println(this.name + " uses 돌진.");
    }
}