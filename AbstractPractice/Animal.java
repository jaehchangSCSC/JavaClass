package AbstractPractice;

abstract class Animal{
    public String food;
    public String noise;
    public String name;
    private String status = "awake";
    // 곳에 이 동물의 Status를 조작하면 안될 것 같아서 private으로 설정하였습니다.
    abstract void makeNoise();
    abstract void eat();
    abstract void roam();
    public void attack(){
        System.out.println("Bites");
    }
    public String checkstatus(){
        return this.status;
    }
    //상태는 깨어있음, 자고있음으로 분류
    public void sleep(){
        if(this.status == "sleep"){
            System.out.println(this.name + " Already sleeping");
        }else{
            this.status = "sleep";
            System.out.println(this.name + " Goes to Sleep");
        }
    }
    public void wakeup(){
        if(this.status == "awake"){
            System.out.println(this.name + " Not Sleeping");
        }else{
            this.status = "awake";
            System.out.println(this.name + " Waking up");
        }
    }
    //Set Food
    public void setfood(String newfood){
        this.food = newfood;
    }
}