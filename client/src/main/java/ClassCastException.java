public class ClassCastException {
    public static void main(String[] args) {
        Object obj = new Integer(100);
        Long aLong = (Long) obj;
    }
}
