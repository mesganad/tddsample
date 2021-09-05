package validateusername;

public class Username {
    public static void main(String[] args) {
        System.out.println("Validating username");
        String username="validusername";
        System.out.println(isValidUsername(username));
        System.out.println("Added for test");
    }

     public static boolean isValidUsername(String username) {
        if (username.contains("/")||username.contains("@")||username.contains("_")
                ||username.contains(" ")||username.contains("#")){
            return false;
        }
        return true;
    }
}
