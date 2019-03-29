package CastingPractice;
import java.util.*;

class Wartotle extends Pokemon implements WaterType{
    Scanner sc = new Scanner(System.in);
    public Wartotle(String newName, int initial_level, String Caught){
        this.name = newName;
        this.level = initial_level;
        this.HP = 20 + 2 * (this.level);
        this.location = Caught;
        this.intimacy = 0;
    }

    public int waterattack(){
        int damage = 7;
        System.out.println(this.name + " 물대포 사용! ");
        return damage;
    }

    public void levelup(){
        this.level += 1;
        if(this.level >= 36){
            this.evolve();
        }
    }

    public void evolve(){
        if(this.level < 36){
            System.out.println("아직 진화하기에는 이릅니다.");
        } else{
            System.out.println("진화하시겠습니까? (Y/N)");
            String evolveinput = sc.nextLine();
            if(evolveinput == "Y"){
                //이 부분에서 진화를 해야한다 >> HOW!?
                System.out.println("Blastoise로 진화!");
            }else{
                System.out.println("진화를 하지 않으셨습니다.");
            }
        }
    }
}