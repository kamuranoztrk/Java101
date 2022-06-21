package Giriş_2;
import java.util.Scanner;
public class havaSıcaklıgı {
    public static void main(String[] args) {
        int temp;

        Scanner imp = new Scanner(System.in);
        System.out.print("Hava sıvaklığını giriniz: ");
        temp = imp.nextInt();

        if (temp <= 5){
            System.out.println("Kayak yapabilirsiniz!");
        } else if (temp > 5 && temp <= 15) {
            System.out.println("Sinemaya gidebilirsiniz!");
        } else if (temp > 15 && temp <= 25) {
            System.out.println("Pikniğe gidebilirsiniz!");
        } else if (temp > 25) {
            System.out.println("Yüzmeye gidebilirsiniz!");
        }
    }
}
