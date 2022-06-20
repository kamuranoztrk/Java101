package Giriş;
import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.17, domates = 1.11, muz = 0.95, patlıcan = 5.00;
        double armutM, elmaM, domatesM, muzM, patlıcanM;
        double toplam;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo armut istediğinizi giriniz: ");
        armutM = input.nextDouble();

        System.out.print("Kaç kilo elma istediğinizi giriniz: ");
        elmaM = input.nextDouble();

        System.out.print("Kaç kilo domates istediğinizi giriniz: ");
        domatesM = input.nextDouble();

        System.out.print("Kaç kilo muz istediğinizi giriniz: ");
        muzM = input.nextDouble();

        System.out.print("Kaç kilo patlıcan istediğinizi giriniz: ");
        patlıcanM = input.nextDouble();

        toplam = ((armut * armutM) + (elma * elmaM) + (domates * domatesM) + (muz * muzM) + (patlıcan * patlıcanM));

        System.out.print("Toplam tutarınız: " + toplam);


    }
}
