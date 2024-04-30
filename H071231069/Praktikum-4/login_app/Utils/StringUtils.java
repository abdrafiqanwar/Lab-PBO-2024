package login_app.Utils;

public class StringUtils {
    public static String nickName(String fullName) {
        String[] nameParts = fullName.split(" ");

        if (nameParts.length == 1){
            return fullName;
        } else {
            return nameParts[1];
        
        }
    }
    
}
