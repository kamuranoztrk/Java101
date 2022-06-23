package Giriş_3;
import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        int n,r, total1=1 , total2=1,total3=1 ;
        Scanner input = new Scanner(System.in);

        System.out.print("kombinasyonun birinci değişkenini girniz: ");
        n = input.nextInt();
        System.out.print("kombinasyonun birinci değişkenini girniz: ");
        r = input.nextInt();

        for (int i = 1 ; i <=n ; i++){
            total1 = total1 * i;
        }
        for (int i = 1 ; i <=r ; i++){
            total2 = total2 * i;
        }
        for (int i = 1 ; i <=(n-r) ; i++){
            total3 = total3 * i;
        }
        int combination = (total1 / (total2 * total3));
        System.out.println("kombinasyonun cevabı: " + combination );
    }
}
