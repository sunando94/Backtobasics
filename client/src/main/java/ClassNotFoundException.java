import com.databricks.base.*;

import java.lang.reflect.InvocationTargetException;
import org.apache.commons.lang3.StringUtils;
public class ClassNotFoundException {
    public static void main(String[] args) {



         //call method with reflection
        try {
            new ClassNotFoundException().runDynamicBinding();
        } catch (java.lang.ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }


    public void runDynamicBinding() throws java.lang.ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName("com.databricks.base.CustomDriver");
        Object instance = clazz.getConstructor().newInstance();
        clazz.getMethod("runDriver").invoke(instance);
    }

    public String runAndCheckClassloaderForClass(String stringClazz) throws java.lang.ClassNotFoundException {

        Class klass = Class.forName(stringClazz);
        String klassName = klass.getCanonicalName();
        String klassPath = klassName.replace('.', '/') + ".class";

        ClassLoader loader = klass.getClassLoader();
        if (loader == null){
            loader = ClassLoader.getSystemClassLoader();
        }
        String jarPath = loader.getResource(klassPath).getPath();
        return jarPath.substring(0,StringUtils.lastIndexOf(jarPath, "jar")+3);
    }
}
