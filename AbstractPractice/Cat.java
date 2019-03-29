package AbstractPractice;

public class Cat extends Feline{
    public Cat(String newName){
        this.setfood("생선");
        this.noise = "Meow";
        this.name = newName;
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