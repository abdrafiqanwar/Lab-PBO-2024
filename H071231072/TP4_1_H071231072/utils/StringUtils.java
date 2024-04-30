package TP4_1_H071231072.utils ;

public class StringUtils {
    public static String getNickName(String fullName) {
        String[] words = fullName.split("\\s+");

        if (words.length == 1) {
            return fullName;
        } else {
            return words[1];
        }
    }
}