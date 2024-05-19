package lk.ZenVeus.javafx;

import org.mindrot.jbcrypt.BCrypt;

public class app {
    public static void main(String[] args) {

        String password = "1234";
        System.out.println("password: " +password );

        String pass = hashPassword(password); // hashed password
        System.out.println("hashed password: " +pass );


        boolean check = checkPassword(password, pass); // check password
        System.out.println("password match: " +check );

    }
    public static String hashPassword(String password) {
        String salt = BCrypt.gensalt();
        return BCrypt.hashpw(password, salt);
    }
    public static boolean checkPassword(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }
}
