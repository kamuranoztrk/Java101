package Giriş_3;
import java.util.Scanner;
public class forDongu {
    public static void main(String[] args) {
        int value, j = 0, total = 0, avarage = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        value = input.nextInt();

        for (int i=1; i<=value; i++){
            if(i % 3 == 0 && i % 4 == 0){
                j++;
                total += i;
            }
        }
        avarage = total / j;
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması : " + avarage);
    }
}