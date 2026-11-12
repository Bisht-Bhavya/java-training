public class Customexp {
public static void main(String[]args){
try{
    method1();
}catch(MyCustomException e){
System.out.println(e.getMessage());
}
}
public static void method1() throws MyCustomException{
    throw new MyCustomException("Custom issue alert");
}
}
class MyCustomException extends Exception{
        MyCustomException(String message){
            super(message);
        }
}