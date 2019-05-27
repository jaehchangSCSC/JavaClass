package AbstractPractice;

import java.io.Serializable;

public class Dog extends Canine implements Serializable {
    public Dog(String newName){
        this.setfood("고기");
        this.noise = "Woof Woof";
        this.name = newName;
    }
    public void attack(){
        System.out.println(this.name + " uses 짖기.");
    }
}