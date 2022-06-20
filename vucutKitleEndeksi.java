package Giriş;
import java.util.Scanner;
public class vucutKitleEndeksi {
    public static void main(String[] args) {
        double kilo, boy;
        double indeks;
        Scanner veri = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz(, ile kg): ");
        kilo = veri.nextDouble();

        System.out.print("Boyunuzu giriniz(, ile m): ");
        boy = veri.nextDouble();

        indeks = ( kilo / (boy * boy));

        System.out.print("Vücut kitle indeksiniz : " + indeks);



    }
}
