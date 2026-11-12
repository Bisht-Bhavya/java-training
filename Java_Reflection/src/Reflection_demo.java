import java.lang.reflect.*;

class Bird{
    public String breed;
    private boolean canfly;

    public void fly(){
        System.out.println("Fly");
    }

    public void eat(){
        System.out.println("Eat");
    }
}

class Kite{
    private Kite(){

    }
    public void canfly(){
        System.out.println("The Kite can fly");
    }
}

public class Reflection_demo {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, ClassNotFoundException,NoSuchFieldException, IllegalAccessException {

        /*This is how to create reflection objects for a class*/
        Class<?> birdclass = Class.forName("Bird");

        //Class birdclass = Bird.class;

        //Bird obj = new Bird();
        //Class birdclass = obj.getClass();

        System.out.println(birdclass.getName());
        System.out.println(Modifier.toString(birdclass.getModifiers()));

        /*This is how to retrieve method list
        p.s. This can also show parent methods which are inherited
         */
            Method[] methods = birdclass.getMethods();
            for (Method meth : methods) {
                System.out.println("Method names: " + meth.getName());
            }System.out.println();


        //To only get this class methods use://
            Method[] method = birdclass.getDeclaredMethods();
            for (Method meth : method) {
                System.out.println("Method names: " + meth.getName());
            } System.out.println();

        //This is how to retrieve fields
        //p.s. Returns only public fields
        Field[] fields = birdclass.getFields();
        for(Field fie:fields){
            System.out.println("Field name: "+fie.getName());
            System.out.println("Type: "+fie.getType());
            System.out.println("Modifier: "+Modifier.toString(fie.getModifiers()));
            System.out.println("***********");
        }System.out.println();

        //To access private fields use
        Field[] field = birdclass.getDeclaredFields();
        for(Field fie:field){
            System.out.println("Field name: "+fie.getName());
            System.out.println("Type: "+fie.getType());
            System.out.println("Modifier: "+Modifier.toString(fie.getModifiers()));
            System.out.println("***********");
        }System.out.println();

        //Setting the value of a field
        Bird birdobj = new Bird();
        Field field1 = birdclass.getDeclaredField("breed");
        field1.set(birdobj, "eaglebrownbreed");
        System.out.println(birdobj.breed);

        //To access private fields
        Field field2 = birdclass.getDeclaredField("canfly");
        field2.setAccessible(true);
        field2.set(birdobj,true);
        if(field2.getBoolean(birdobj)) System.out.println("Value is set to true\n");

        //Reflection of a constructor
        Class kiteclass = Kite.class;
        //To access private constructor too
        Constructor[] kiteconstructorlist = kiteclass.getDeclaredConstructors();
        for(Constructor cons: kiteconstructorlist){
            System.out.println("Modifier: "+ Modifier.toString(cons.getModifiers()));

            cons.setAccessible(true);
            Kite kiteobj = (Kite)cons.newInstance();
            kiteobj.canfly();
        }
    }
}
