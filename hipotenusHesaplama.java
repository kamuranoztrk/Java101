package Giriş_2;
import java.util.Scanner;
public class hipotenusHesaplama {
    public static void main(String[] args) {
        double birincikenar, ikincikenar;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Üçgenin birinci kenarını giriniz: ");
        birincikenar = girdi.nextDouble();

        System.out.print("üçgenin ikinci kenarını giriniz: ");
        ikincikenar = girdi.nextDouble();

        double hipotenus = Math.sqrt((birincikenar * birincikenar) + (ikincikenar * ikincikenar) );

        System.out.println("Üçgenin hipotenüsü: " + hipotenus);
    }
}
