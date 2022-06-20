package Giriş;

import java.util.Scanner;
public class taksimetreHesaplama {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total = 10;
        Scanner veri = new Scanner(System.in);

        System.out.print("Gidilecek mesafeyi giriniz: ");
        km = veri.nextInt();

        total += (km * perKm);
        total = (total < 20) ? 20 : total;

        System.out.println("Toplam tutar: " + total );
    }

}
