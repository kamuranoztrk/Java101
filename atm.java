package Giriş_3;
import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        String username, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 2000;
        int select;

        while (right > 0){
            System.out.print("Kullanıcı adınızı giriniz: ");
            username = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password =input.nextLine();

            if (username.equals("patika") && password.equals("dev1234")) {
                System.out.println("Merhaba bankamıza hoşgeldiniz!");
                do {
                    System.out.print("1-Para yatırmak\n" + "2- Para çekme\n" + "3-Bakiye sorgulama\n" + "4-Çıkış yap\n");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select =input.nextInt();
                    switch (select){
                        case (1):
                            System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                            int price = input.nextInt();
                            balance += price;
                        break;
                        case (2):
                            System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                            int pric = input.nextInt();
                            balance -= pric;
                        break;
                        case (3):
                            System.out.println("Bakiyeniz: " + balance);
                        break;
                    }
                }while (select != 4 );
                    System.out.println("Tekrar görüşmek izere!");
                break;
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz! Tekrar deneyiniz.");
                    if (right == 0){
                        System.out.println("Hesabınız bloke olmuştur!");
                    }else{
                        System.out.println("Kalan hakkınız: " + right);
                    }
            }
        }
    }
}
