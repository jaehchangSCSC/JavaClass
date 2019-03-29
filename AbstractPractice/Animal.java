package AbstractPractice;

abstract class Animal{
    //기본 변수에 대한 Method는 Animal에 공통적으로 갖고 있을 수 있다
    public String food;
    public String noise;
    public String name;
    //아직 정해지지 않은 것은 Abstract으로 놓아서 Sub-Class에서 구체화
    abstract void roam();
    abstract void attack();
    //오브젝트의 상태로, 임의로 접근이 불가하도록 Private으로 설정하고 Animal에서 변경
    private int fullness = 5;
    private String status = "awake";

    // 곳에 이 동물의 Status를 조작하면 안될 것 같아서 private으로 설정하였습니다.
    public void makeNoise(){
        if(this.checkstatus() == "sleep"){
            System.out.println("쿨쿨 (Sleeping Sound)");
        }
        else if(this.fullness == 0){
            System.out.println(this.name + " is hungry, cannot make noise");
        }
        else{
            System.out.println(this.name+ "은(는) " + this.noise + " 소리를 냅니다.");
            this.fullness -= 1;
        }
    }
    protected void movementmade(){
        this.fullness -= 1;
    }
    protected int checkfullness(){
        return fullness;
    }
    public void eat(){
        if(this.checkstatus() == "sleep"){
            System.out.println(this.name + " is currently sleeping, cannot eat. (Wake it up first)");
        }
        else if(this.fullness == 10){
            System.out.println(this.name + " is full, cannot eat more.");
        }
        else{
            System.out.println(this.name + "은(는) " + this.food + "를(을) 먹습니다.");
            this.fullness+=1;
        }
    }
    //상태를 직접 변경할 수 없지만 확인을 할 수 있어야하는 이유
    //Eat을 사용할때 자고있으면 못먹게 막음
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