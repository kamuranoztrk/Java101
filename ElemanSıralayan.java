import java.util.Scanner;
import java.util.Arrays;

public class ElemanSıralayan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int boyut = input.nextInt();

        int[] list = new int[boyut];
        for( int i = 1 ; i< boyut; i ++){
            System.out.print(i + ". Elemanı : ");
            int sayı = input.nextInt();
            list[i] = sayı;

        }
        Arrays.sort(list);
        System.out.println("Sıralama: " + Arrays.toString(list));
    }
}
