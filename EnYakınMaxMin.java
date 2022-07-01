import java.util.Arrays;
import java.util.Scanner;

public class EnYakınMaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list= { 15,12,788,1,-1,-788,2,0};
        int min = list[0];
        int max = list[0];

        System.out.print("Bir sayı giriniz: ");
        int girilenSayı = input.nextInt();

        Arrays.sort(list);
        for(int i : list){
            if(i < girilenSayı ){
                min = i;
            }
            if (i>girilenSayı){
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
    }
}

