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

    public static String nickName(String fullName) {
        String[] nameParts = fullName.split(" ");

        if (nameParts.length == 1) {
            return nameParts[0];
        } else {
            if (nameParts[0].startsWith("Muh.") || nameParts[0].startsWith("Muhammad")){
                return nameParts[1];
            }
            return nameParts[0];
        }
    }
}