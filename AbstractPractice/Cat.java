package AbstractPractice;

public class Cat extends Feline{
    public Cat(String newName){
        this.setfood("생선");
        this.noise = "Meow";
        this.name = newName;
    }
    public void attack(){
        System.out.println(this.name + " uses 냥냥펀치!");
    }
}