package AbstractPractice;

abstract class Feline extends Animal{
    public void roam(){
        System.out.println("Gently");
    }
    @Override
    public void attack(){
        System.out.println("Scratch");
    }
}