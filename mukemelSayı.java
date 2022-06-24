package Giriş_3;
import java.util.Scanner;
public class mukemelSayı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayı = input.nextInt();
        int total=0;

        for (int i = 1; i < sayı ; i++){
            if ( sayı % i == 0 ) {
                total += i ;
            }
        }
        if(total == sayı){
            System.out.println(sayı + "bir mükemmel sayıdır.");
        }else{
            System.out.println(sayı + "bir mükemmel sayı değildir." );
        }
    }
}
