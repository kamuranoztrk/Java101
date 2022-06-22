package Giriş_2;
import java.util.Scanner;
public class ucakBiletiHesaplama {
    public static void main(String[] args) {
        double mesafe, yas, yon, normalTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Yönünüzü seçiniz\n 1-Tek yön\n 2-Gidiş Dönüş: ");
        yon = input.nextDouble();
        System.out.print("Gitmek istediğiniz mesafeyi giriniz(km): ");
        mesafe = input.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextDouble();

        normalTutar = (mesafe * 0.10);


        if ( yon == 2){

            if (yas <= 12){
                System.out.println("Bilet fiyatınız: " +((normalTutar - (normalTutar * 0.5)) - ((normalTutar - (normalTutar * 0.5)) * 0.2))*2);
            }
            if (yas > 12 && yas <= 24 ){
                System.out.println("Bilet fiyatınız: " +((normalTutar - (normalTutar * 0.1)) - ((normalTutar - (normalTutar * 0.1)) * 0.2))*2);
        }
            if (yas > 65 ){
                System.out.println("Bilet fiyatınız: " + ((normalTutar - (normalTutar * 0.3)) - ((normalTutar - (normalTutar * 0.3)) * 0.2))*2) ;
        }
            if (yas > 24 && yas <= 65){
                System.out.println("Bilet fiyatınız: " + (normalTutar - (normalTutar * 0.2)));
        }
        } else if (yon == 1){
                if (yas <= 12){
                    System.out.println("Bilet fiyatınız: " + (normalTutar - (normalTutar - (normalTutar * 0.5))));
                }
                if (yas > 12 && yas <= 24 ){
                    System.out.println("Bilet fiyatınız: " + (normalTutar - (normalTutar - (normalTutar * 0.1))));
                }
                if (yas > 65 ){
                    System.out.println("Bilet fiyatınız: " + (normalTutar - (normalTutar - (normalTutar * 0.3))));
                }
                if (yas > 24 && yas <= 65){
                    System.out.println("Bilet fiyatınız: " + normalTutar);
                }
            } else {
                System.out.println("Hatalı yön girişi yaptınız!");
            }


    }
}
