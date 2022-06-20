package Giriş_2;

import java.util.Scanner;
public class KDVhesaplama {
    public static void main(String[] args) {
        // kullanıcıdan fiyat iste
        double fiyat, kdvOran = 0.18, kdvTutari, kdvliFiyat;
        Scanner inp = new Scanner(System.in);

        System.out.print("Hseaplamak istediğiniz tutarı giriniz: ");
        fiyat = inp.nextDouble();

        kdvTutari = (fiyat * kdvOran);
        kdvliFiyat = (fiyat + kdvTutari);

        System.out.println("KDV'siz fiyatınız: " + fiyat);
        System.out.println("KDV oranı: " + kdvOran);
        System.out.println("KDV tutarınız: " + kdvTutari);
        System.out.println("KDV'li fiyatınız: " + kdvliFiyat);

    }
}
