package Giriş_3;
import java.util.Scanner;
public class fibonacciserisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int num= input.nextInt();
        int n1=1, n2=1 , total;

        for (int i = 2; i<=num; i++){
            total = n1+n2;
            System.out.print(n1 + " + " + n2 + " = " + total);
            n1=n2;
            n2 = total;
            System.out.println();

        }
    }
}
