package Giriş_3;
import java.util.Scanner;
public class tersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını yazınız: ");
        int basnum = input.nextInt();

        for ( int i = 0; i <= basnum ; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = (2*basnum)-1; j>2*i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
