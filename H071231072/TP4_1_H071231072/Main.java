package TP4_1_H071231072;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import TP4_1_H071231072.models.Profile;
import TP4_1_H071231072.models.User;
import TP4_1_H071231072.utils.StringUtils;

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
                break;
            default:
                runApp();
        }
    }

    private static void showLoginMenu() {
        System.out.println("-------------------------");
        System.out.println("Login");
        System.out.println("Masukkan Username");
        System.out.print("> ");
    
        String username = sc.next();
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
        }
    
        if (userIndex != -1) {
            User user = listUser.get(userIndex);
            Profile profile = listUserProfile.get(userIndex);
    
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.next();
    
            if (user.checkPassword(password)) {
                System.out.println("Berhasil Login");
                showDetailUser(profile);
                System.exit(0);
            } else {
                System.out.println("Password Salah");
            }
        } else {
            System.out.println("Username tidak ditemukan.");
        }
    }
   
    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");
    
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
    
      
        boolean usernameExists = false;
        for (User user : listUser) {
            if (user.getUsername().equals(username)) {
                System.out.println("Username sudah ada , mohon masukkan ulang username");
                usernameExists = true; 
                break;
            }
        }
    
        if (!usernameExists) {
            String password = "";
            while (true) {
                System.out.println("Password");
                System.out.print("> ");
                password = sc.nextLine();
                String[] input = password.split("");
                if (input.length < 9 && input.length!= -1) {
                    break;
                } else {
                    System.out.println("Password harus maksimal 8");
                }
            }
            User user = new User(username, password);
    
            Profile profile = new Profile();
    
            System.out.println("Nama Lengkap");
            System.out.print("> ");
            String fullName = sc.nextLine();
    
            int age = 0;
            while (true) {
                System.out.println("Umur");
                System.out.print("> ");
                try {
                    if (sc.hasNextInt()) {
                        age = sc.nextInt();
                        break;
                    } else {
                        System.out.println("Input bukan tipe data int. Masukkan ulang.");
                        sc.nextLine();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Masukkan ulang");
                    sc.nextLine();
                }
            }
            sc.nextLine();
    
            System.out.println("Hobby");
            System.out.print("> ");
            String hobby = sc.nextLine();
    
            profile.setFullName(fullName);
            profile.setAge(age);
            profile.setHobby(hobby);
    
            String nickName = StringUtils.getNickName(fullName);
            profile.setNickName(nickName);
    
            listUser.add(user);
    
            listUserProfile.add(profile);
    
            System.out.println("-------------------------");
            System.out.println("Berhasil Membuat User Baru!!");
            runApp();
        } else {
            showRegisterMenu();
        }
    }
    private static void showDetailUser(Profile profile) {
        System.out.println("-------------------------");
        System.out.println("SELAMAT DATANG !!");
        System.out.println("-------------------------");
        System.out.println("Nama Lengkap   : " + profile.getFullName());
        System.out.println("Nama Panggilan : " + profile.getNickName());
        System.out.println("Umur           : " + profile.getAge());
        System.out.println("Hobby          : " + profile.getHobby());
        System.out.println("-------------------------");
    }
}
