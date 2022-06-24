package Giriş_3;
import java.util.Scanner;
public class ebobekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        int ebob = 1;
        int ekok = 1;
        System.out.print("Birinci sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();
        if (n1 < n2){
            for (int i = n1; i >= 1; i--) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    System.out.println(" Bu sayıların EBOB'U : " + ebob);
                    break;
                }
            }
            for (int k = 1; k <= (n1 * n2); k++){
                if (k%n1==0 && k%n2==0){
                    ekok = k ;
                    System.out.println(" Bu sayıların EKOK'u : " + ekok);
                    break;
                }
            }
        }else {
            System.out.println("Sayıları birinci sayı küçük olacak şekilede giriniz!");
        }
    }
}
