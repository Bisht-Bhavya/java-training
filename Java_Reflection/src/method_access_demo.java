import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class method_access_demo {
    public static void main(String args[]) throws InstantiationException,IllegalAccessException,ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
 Class<?> eagleclass = Class.forName("Eagle");
 Object eagleobject = eagleclass.getDeclaredConstructor().newInstance();

 Method flymethod = eagleclass.getMethod("fly", int.class, boolean.class, String.class);
 flymethod.invoke(eagleobject, 1,true,"hello");
    }
}
