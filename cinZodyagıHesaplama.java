package Giriş_2;
import java.util.Scanner;
public class cinZodyagıHesaplama {
    public static void main(String[] args) {
        int yıl;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        yıl = input.nextInt();

        int bolum = (yıl % 12);

        switch (bolum){
            case 0:
                System.out.println("Maymun Burcu");
                break;
            case 1:
                System.out.println("Horoz Burcu");
                break;
            case 2:
                System.out.println("Köpek Burcu");
                break;
            case 3:
                System.out.println("Domuz Burcu");
                break;
            case 4:
                System.out.println("Fare Burcu");
                break;
            case 5:
                System.out.println("Öküz Burcu");
                break;
            case 6:
                System.out.println("Kaplan Burcu");
                break;
            case 7:
                System.out.println("Tavşan Burcu");
                break;
            case 8:
                System.out.println("Ejderha Burcu");
                break;
            case 9:
                System.out.println("Yılan Burcu");
                break;
            case 10:
                System.out.println("At Burcu");
                break;
            case 11:
                System.out.println("Koyun Burcu");
                break;
            default:
                System.out.println("Yanlış sayı girdiniz");
                break;
        }

    }
}
