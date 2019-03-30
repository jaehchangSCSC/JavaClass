package CastingPractice;
import java.util.*;

class Squirtle extends WaterType{
    Scanner sc = new Scanner(System.in);
    public Squirtle(){        
    }
    public Squirtle(String newName, int initial_level, String Caught){
        this.name = newName;
        this.level = initial_level;
        this.HP = 10 + (this.level);
        this.location = Caught;
        this.intimacy = 0;
    }
    //Waterattack 구체화
    public int waterattack(){
        int damage = 5;
        System.out.println(this.name + " " + this.skills[0] +" 사용! ");
        return damage;
    }

    public void levelup(){
        this.level += 1;
        if(this.level >= 16){
            this.evolve();
        }else if(this.level > 100){
            this.level -= 1;
            System.out.println("더 이상 Level을 올릴 수 없습니다.")
        }
    }

    public void evolve(){
        if(this.level < 16){
            System.out.println("아직 진화하기에는 이릅니다.");
        } else{
            System.out.println("진화하시겠습니까? (Y/N)");
            String evolveinput = sc.nextLine();
            if(evolveinput == "Y"){
                //이 부분에서 진화를 해야한다 >> HOW!?
                System.out.println("Wartotle로 진화!");
            }else{
                System.out.println("진화를 하지 않으셨습니다.");
            }
        }
    }

}