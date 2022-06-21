package Giriş_2;
import java.util.Scanner;

public class hesapMakinesi2 {
    public static void main(String[] args) {
        int a, b, select ;

        Scanner input = new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        b = input.nextInt();

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        System.out.println(select);

        switch (select){
            case 1:
                System.out.print("Toplam: " + (a + b));
                break;
            case 2:
                System.out.print("Fark: " + (a - b));
                break;
            case 3:
                System.out.print("Çarpım: " + (a * b));
                break;
            case 4:
                switch (b){
                    case 0:
                        System.out.print("Bir sayı sıfıra bölünemez!");
                        break;
                }
                        System.out.print("Bölüm: " + (a / b));
                break;
            default :
                System.out.print("Yanlış seçim yaptınız!");
                break;
        }
    }
}
