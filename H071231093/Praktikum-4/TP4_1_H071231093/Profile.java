public class Profile {
    /* 
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
    */

    private String fullName;
    private String hobby;
    private String nickName;
    private int age;
    

    public Profile() {

    }


    public Profile(String fullName, String hobby, String nickName, int age) {
        this.fullName = fullName;
        this.hobby = hobby;
        this.nickName = nickName;
        this.age = age;
    }


    public String getFullName() {
        return fullName;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getHobby() {
        return hobby;
    }


    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


    public String getNickName() {
        return nickName;
    }


    public void setNickName(String nickName) {
        this.nickName = nickName;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    };    


   
}