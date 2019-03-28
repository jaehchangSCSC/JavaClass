package InterfacePractice;

public class Robot{
    protected int fuel = 0;
    public void addfuel(int adding){
        this.fuel = adding;
    }
    public void fuelcheck(){
        System.out.println(this.fuel);
    }
}