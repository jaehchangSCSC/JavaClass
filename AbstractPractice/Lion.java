package AbstractPractice;

public class Lion extends Feline{
    public Lion(String newName){
        this.setfood("초원 속의 동물");
        this.noise = "어흐흐으으";
        this.name = newName;
    }
    public void attack(){
        System.out.println(this.name + " uses 깨물어부수기.");
    }
}