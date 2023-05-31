import com.databricks.base.*;

public class NoSuchMethodError {
    public static void main(String[] args) {
        CustomDriver customDriver = new CustomDriver();
        customDriver.setData("test");
        System.out.println("data in custom driver :".concat(customDriver.getData()));
    }
}
