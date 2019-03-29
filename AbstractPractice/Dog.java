package AbstractPractice;

public class Dog extends Canine{
    public Dog(String newName){
        this.setfood("고기");
        this.noise = "Woof Woof";
        this.name = newName;
    }
    public void attack(){
        System.out.println(this.name + " uses 짖기.");
    }
}