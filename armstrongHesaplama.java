package Giriş_3;
import java.util.Scanner;
public class armstrongHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bulmak istadiğiniz sayıyı biriniz: ");
        int number = input.nextInt() ;
        int basNumber=0;
        int basValue;
        int tempNumber = number;
        int result = 0;
        int basPow;

        if (number < 1000) {
            while (tempNumber != 0) {
                tempNumber /= 10;
                basNumber++;
            }
            tempNumber = number;
            while (tempNumber != 0) {
                basValue = tempNumber % 10;
                basPow = 1;
                for (int i = 1; i <= basNumber; i++) {
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /= 10;
            }
            if (result == number) {
                System.out.println(number + " sayısı bir Armstrong sayıdır.");
            } else {
                System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
            }
        } else {
            System.out.println("1000' den küçük bir sayı giriniz!");
        }
    }

}
