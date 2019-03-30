package InterfacePractice;

public class Dog extends Canine implements Pet{
    public Dog(String newName){
        this.setfood("고기");
        this.noise = "Woof Woof";
        this.name = newName;
    }
    public void attack(){
        System.out.println(this.name + " uses 짖기.");
    }
    public void play(){
        System.out.println("Woof Woof(There it goes to catch the balls)");
    }
    public void beFriendly(){
        System.out.println("Woof Woof Woof");
    }
}