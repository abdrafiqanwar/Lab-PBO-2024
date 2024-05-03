package login_app.Utils;

public class StringUtils {
    /*
     TODO
     * Buatlah sebuah method static yang akan
     * mengembalikan nickName berdasarkan fullName yang diberikan
     * aturan pembuatan nickName adalah :
     * 1. Jika fullName hanya 1 kata maka nickName = fullName
     * (ex: FullName = Agus, maka NickName = Agus)
     * 2. Jika fullName lebih dari 1 kata maka nickName adalah kata kedua dari
     * fullName
     * (ex: FullName = Eurico Devon, maka NickName = Devon)
     */
    public static String NickName(String fullName) {
        String [] namepart = fullName.split(" ");

        if (namepart.length == 1) {
            return namepart[0];
        } else {
            if (namepart[0].startsWith("Muh.")) {
                return namepart[1];
            }
            return namepart[0];
        }
    }
}