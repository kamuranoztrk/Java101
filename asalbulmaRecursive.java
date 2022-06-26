package Giris_4;

import java.util.Scanner;

public class asalbulmaRecursive {

    static boolean asal(int n){
        int result = 0;
        for(int i = 2; i <n; i++){
            if(n % i == 0 ){
                result++;
            }
        }
        if(result == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();
        System.out.println(asal(n));
        if(asal(n) == true){
            System.out.println(n + " Asal sayıdır!");
        }else{
            System.out.println(n + " Asal sayı değildir!");
        }
    }
}
