import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        // değişkenler
        int mat, fizik, kimya, turkce, tarih, muzik;
        // Scanner sınıfı tanımladık
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();

        System.out.print("fizik notunuzu giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam/6;
        System.out.println("ortalamanız" + sonuc);

        System.out.println(sonuc >= 60 ? "Sınıfı Geçti!" : "Sınıfta Kaldı!");

    }
}

