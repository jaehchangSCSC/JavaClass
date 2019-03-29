package AbstractPractice;

public class Hippo extends Animal{
    public Hippo(String newName){
        this.setfood("Grass");
        this.noise = "으어어어";
        this.name = newName;
    }
    public void roam(){
        System.out.println("천천히 느리게");
    }
    public void makeNoise(){
        if(this.checkstatus() == "sleep"){
            System.out.println("쿨쿨 (Sleeping Sound)");
        }
        else{
            System.out.println(this.name+ "은(는) " + this.noise + " 소리를 냅니다.");
        }
    }
    public void eat(){
        if(this.checkstatus() == "sleep"){
            System.out.println(this.name + " is currently sleeping, cannot eat. (Wake it up first)");
        }
        else{
            System.out.println(this.name + "은(는) " + this.food + "를(을) 먹습니다.");
        }
    }
}