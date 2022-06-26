package Giris_4;

import java.util.Scanner;

public class usHesabıRecusive {

    static int power(){
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("Üssü giriniz: ");
        int b = input.nextInt();
        int result = 1;
        for (int i=1 ; i<=b ; i++){
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Sonuç: " + power());
    }
}
