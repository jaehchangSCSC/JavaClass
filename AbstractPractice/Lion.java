package AbstractPractice;

public class Lion extends Feline{
    public Lion(String newName){
        this.setfood("초원 속의 동물");
        this.noise = "어흐흐으으";
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