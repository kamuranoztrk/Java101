package Giriş;
import java.util.Scanner;
public class daireAlanıVeCevresi {
    public static void main(String[] args) {
        int r;
        double cevre, alan;
        Scanner veri = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = veri.nextInt();
        cevre = (2 * 3.14 * r);
        alan = ( 3.14 * r * r);

        System.out.println("Dairenin çevesi: " + cevre);
        System.out.println("Dairenin alanı: " + alan);
    }

}
