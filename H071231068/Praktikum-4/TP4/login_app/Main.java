package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        int selectMenu = sc.nextInt();
        sc.nextLine();
        switch (selectMenu) {
            case 1:
                showLoginMenu();
                break;
            case 2:
                showRegisterMenu();
            default:
                runApp();
        }
    }

    private static void showLoginMenu() {
        System.out.println("-------------------------");
        System.out.println("Login");
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.nextLine();
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUserName().equals(username)) {
                userIndex = i;
                break;
            }
        }

        if (userIndex != -1) {
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.nextLine();

            boolean isPasswordMatch = listUser.get(userIndex).getPassword().equals(password);

            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                showDetailUser(listUserProfile.get(userIndex));
                runApp();
                System.exit(0);
            } else {
                System.out.println("Password Salah");
            }
        } else {
            System.out.println("Username tidak ditemukan");
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        String username = "";
        while (username.isEmpty()) {
            System.out.println("Username");
            System.out.print("> ");
            username = sc.nextLine();
            if (username.isEmpty()) {
                System.out.println("Username tidak boleh kosong");
            }
        }

        if (isUsernameExists(username)) {
            System.out.println("Username sudah digunakan, silahkan inputkan username lain");
            showRegisterMenu();
            return;
        }

        String password = "";
        while (password.length() < 8) {
            System.out.println("Password");
            System.out.print("> ");
            password = sc.nextLine();
            if (password.length() < 8) {
                System.out.println("Password harus lebih dari 8 karakter");
            }
        }

        User user = new User(username, password);

        Profile profile = new Profile();

        String fullName = "";
        while (fullName.isEmpty()) {
            System.out.println("Nama Lengkap");
            System.out.print("> ");
            fullName = sc.nextLine();
            if (fullName.isEmpty()) {
                System.out.println("Nama lengkap tidak boleh kosong");
            }
        }

        int age = 0;
        while (age <= 0) {
            System.out.println("Umur");
            System.out.print("> ");
            String input = sc.nextLine();
            try {
                age = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Umur harus berupa angka");
                continue;
            }
            if (age <= 0) {
                System.out.println("Umur harus lebih dari 0");
            }
        }

        String hobby = "";
        while (hobby.isEmpty()) {
            System.out.println("Hobby");
            System.out.print("> ");
            hobby = sc.nextLine();
            if (hobby.isEmpty()) {
                System.out.println("Hobby tidak boleh kosong");
            }
        }

        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);
        profile.setNickName(StringUtils.getNickName(fullName));

        listUser.add(user);
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static boolean isUsernameExists(String username) {
        for (User user : listUser) {
            if (user.getUserName().equals(username)) {
                return true;
            }
        }
        return false;
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("Nama Lengkap: " + profile.getFullName());
        System.out.println("Nama Panggilan: " + profile.getNickName());
        System.out.println("Umur: " + profile.getAge());
        System.out.println("Hobby: " + profile.getHobby());
    }
}