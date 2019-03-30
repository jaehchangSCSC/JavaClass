package InterfacePractice;

public class TestInterface{
    public static void main(String[] args) {
        RoboDog RoboCorki = new RoboDog("RoboCorki");
        Dog Corki = new Dog("Corki");
        System.out.println("We Got one Pet Dog and one Pet RoboDog, Let's see the difference.");
        RoboCorki.play();
        Corki.play();
        System.out.println();
        System.out.println("Oh... RoboCorki did not have fuel, let's add some and turn it back on");
        RoboCorki.addfuel(10);
        RoboCorki.turnon();
        Corki.eat();
        System.out.println();
        System.out.println("Let's play again shall we?");
        RoboCorki.play();
        Corki.play();
        System.out.println();
        RoboCorki.beFriendly();
        Corki.beFriendly();
        System.out.println();
        System.out.println("Time for bed");
        RoboCorki.turnoff();
        Corki.sleep();


    }
}