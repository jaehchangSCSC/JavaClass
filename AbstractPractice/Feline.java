package AbstractPractice;

abstract class Feline extends Animal{
    // Animal클래스 abstract method 구체화
    public void roam(){
        System.out.println("Gently");
    }
    //makeNoise는 아직 모르니 Feline class는 Abstract
    //보통 물어서 공격한다고 가정했을때 고양이(과)는 냥이 펀치
    @Override
    public void attack(){
        System.out.println("Scratch");
    }
}