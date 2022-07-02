import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class SayıTahminOyunu {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        int selected;
        int right = 0;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while(right <5) {
            System.out.print("lütfen tahmininizi giriniz: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("çok fazla hatalı giriş yaptınız. kalan hak: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Birdahaki hatalı girişinizde hakkınızdan düülecektir!");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Tebtikler, doğru tahmin yaptınız! Tahmin ettiğiniz sayı: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı sayı girdiniz!");
                if (selected > number) {
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür.");
                }
                wrong[right++] = selected;
                System.out.println("Kalan hakkınız: " + (5 - right));
            }
        }
        if(!isWin){
            System.out.println("Kaybettiniz!");
            if(!isWrong) {
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
            }
        }
    }


}
