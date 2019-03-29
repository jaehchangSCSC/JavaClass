package CastingPractice;
import java.util.*;

class Blastoise extends Pokemon implements WaterType{
    Scanner sc = new Scanner(System.in);
    public Blastoise(String newName, int initial_level, String Caught){
        this.name = newName;
        this.level = initial_level;
        this.HP = 30 + 3 * (this.level);
        this.location = Caught;
        this.intimacy = 0;
    }

    public int waterattack(){
        int damage = 10;
        System.out.println(this.name + " 하이드로펌프 사용! ");
        return damage;
    }

    public void levelup(){
        if(this.level <= 100){
            this.level += 1;
        } else{
            System.out.println("더 이상 Level을 올릴 수 없습니다.");
        }
    }

    public void evolve(){
        System.out.println("더 이상 진화를 할 수 없습니다.");
    }
}