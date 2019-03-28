interface consume{
    public void eat();
    public void drink();
}

interface status{
    public void sleep();
    public void awake();
}

interface movement{
    public void move();
    public void makenoise();
}

interface breastfeed{
    public void feed();
}

class Animal implements consume{
    @Override
    public void eat(){

    }
    @Override
    public void drink(){
        
    }
}