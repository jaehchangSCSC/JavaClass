package CastingPractice;

abstract class Pokemon{
    protected int level;
    protected int HP; //포켓몬 체력
    public String name;
    protected String location; //포켓몬을 잡은 위치
    protected int intimacy; //친밀도는 특정 포켓몬을 진화시킬 때 필요
    // 포켓몬 타입
    protected String property;
    protected String owner = "WILD";
    abstract void evolve();
    abstract void levelup();
    //레벨 증가할 때 HP도 일정한 양으로 증가해야하는가 >> 포켓몬마다 다를 것 같아서 abstract로 생성
    

}