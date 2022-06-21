package Giriş_2;

import java.util.Scanner;

public class kullanıcıGirisi {
    public static void main(String[] args) {
        String username, password;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        username = inp.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = inp.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız! ");
        }else{
            System.out.println("Bilgileriniz yanlış!");
        }
    }
}
