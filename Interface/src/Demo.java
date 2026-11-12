interface animal{
    public void canwalk();
}

class bat implements animal{
    @Override
    public void canwalk(){
        System.out.println("Bird can walk");
    }
    public void fly(){
        System.out.println("Bird can fly");
    }
}
public class Demo extends bat {
    public static void main(String[]args){
        bat obj = new bat();
        Demo obj2 = new Demo();
        obj.canwalk();
        obj2.canwalk();
    }
}
