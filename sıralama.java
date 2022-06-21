package Giriş_2;
import java.util.Scanner;
public class sıralama {
    public static void main(String[] args) {
        int a, b, c ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        a = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = inp.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        c = inp.nextInt();

        if (a > b && a > c){
            if(b > c){
                System.out.println("c < b < a");
            }else {
                System.out.println("b < c < a");
            }
        }else if (b > a && b > c) {
            if(a>c){
                System.out.println("c < a < b" );
            }else {
                System.out.println("a < c < b" );
            }

        }else if (c > b && c > a) {
            if( b > a){
                System.out.println("a < b < c");
            }else {
                System.out.println("c < a < b");

            }

        }

    }
}
