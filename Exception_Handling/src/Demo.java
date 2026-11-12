public class Demo {
    public static void main(String[]args)  {
        try {
            method1();
        } catch(ClassNotFoundException obj){
            System.out.println("Caught in main method");
        } finally{
            System.out.println("Logged out of propgram");
        }
    }
    public static void method1() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }
}
