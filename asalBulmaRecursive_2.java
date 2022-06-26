package Giris_4;

import java.util.Scanner;

public class asalBulmaRecursive_2 {
    static int asal(){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();
        for(int i = 2; i <n; i++){
            if(n % i == 0 ){
                System.out.println(n + " Asal sayı değildir!");
                break;
            }else{
                System.out.println(n + " asal sayıdır!");
                break;
            }
        }
        return asal();
    }

    public static void main(String[] args) {

        System.out.println(asal());
    }
}

