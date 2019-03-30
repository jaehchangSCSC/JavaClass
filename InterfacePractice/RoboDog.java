package InterfacePractice;

class RoboDog extends Robot implements Pet{
    //Pet Interface를 Implement하여서 정의하는 부분
    public RoboDog(String newName){
        this.name = newName;
    }
    public void play(){
        if (this.fuel == 0 ){
            System.out.println("No more fuel, shutting down.");
            this.status = "off";
        } else if(this.status == "off"){
            System.out.println("It is off, please turn on.");
        } else{
            System.out.println("Let's Play!");
        }
    }
    public void beFriendly(){
        System.out.println("We are menkind's Friend!");
    }
}