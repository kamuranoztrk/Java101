package Giriş_2;
import java.util.Scanner;
public class sınıfGeçmeDurumu {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, muzik, ort;

        Scanner imp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = imp.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fiz = imp.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kim = imp.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        tur = imp.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = imp.nextInt();

        ort = (mat + fiz + kim + tur + muzik)/5;

        System.out.println("Ortalamanız:"+ort);

        if (ort >= 55){
            System.out.println("Sınıfı geçtiniz!");
        }
        else {
            System.out.println("Sınıfta kaldınız!");
        }


    }
}
