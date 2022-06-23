package Giriş_3;
import java.util.Scanner;
public class dortunKatları {
    public static void main(String[] args) {
        int i, total=0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            i = input.nextInt();
            if (i % 4 == 0 ){
                total += i ;
            }
        }while ( i > 0);{
        }
        System.out.println("4'ün katlarının toplamı: " + total);
    }
}
