package Giriş_3;
import java.util.Scanner;
public class maxmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayı;
        int max=0;
        int min=0;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        sayı = input.nextInt();

        for ( int i=1; i<=sayı; i++){
            System.out.print(i + ". Sayıyı giriniz: ");
            int k = input.nextInt();
            if (i == 1){
                max = k;
                min = k;
            }
            else {
                if ( k > max)
                    max = k;
                if (k<min)
                    min = sayı;
            }
        }
        System.out.println("Girdiğiniz sayıların maksimumu: " + max);
        System.out.println("Girdiğiniz sayıların minimumu: " + min);
    }
}
