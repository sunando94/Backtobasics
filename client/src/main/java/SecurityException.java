public class SecurityException {
    public static void main(String[] args) {
        // Attempting to access a restricted system property
        String password = System.getProperty("user.password");
        System.out.println("Password: " + password);
    }
}
