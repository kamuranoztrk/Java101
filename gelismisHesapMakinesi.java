package Giris_4;
import java.util.Scanner;
public class gelismisHesapMakinesi {
    static int sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
         int a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
         int b = input.nextInt();
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }
    static int minus(){
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int b = input.nextInt();
        int result = a - b;
        System.out.println("Fark: " + result);
        return result;
    }
    static int times(){
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int b = input.nextInt();
        int result = a * b;
        System.out.println("Çarpım: " + result);
        return result;
    }
    static int divided(){
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int b = input.nextInt();
        int result = a / b;
        System.out.println("Bölüm: " + result);
        return result;
    }
    static int power(){
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int b = input.nextInt();
        int result= 1;
        for ( int i = 1 ; i <= b ; i++){
            result *= a;
        }
        System.out.println("Sonuç: " + result);
        return result;
    }
    static int fact(){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int a = input.nextInt();
        int result = 1;
        for(int i = 1; i <= a  ; i++) {
            result *= i;
        }
        System.out.println("Sonuç: " + result);
        return result;
    }
    static int mod(){
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int b = input.nextInt();
        int result = a % b;
        System.out.println("Mod: " + result);
        return result;
    }
    static int area(){
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int b = input.nextInt();
        int result1 = a * b;
        System.out.println("Dikdoörtgenin alanı " + result1);
        System.out.println("Dikdörtgenin çevresi: " + (a+b) * 2);
        return result1;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = ("1- Toplama İşlemi\n"
        +"2- Çıkarma İşlemi\n"
        +"3- Çarpma İşlemi\n"
        +"4- Bölme işlemi\n"
        +"5- Üslü Sayı Hesaplama\n "
        +"6- Faktoriyel Hesaplama\n"
        +"7- Mod Alma\n"
        +"8- Dikdörtgen Alan ve Çevre Hesabı\n"
        +"0- Çıkış\n");


        do{
            System.out.println(menu);
            System.out.print("Yapacağınız işlemi seçiniz: ");
            select = input.nextInt();
            //System.out.print("Birinci sayıyı giriniz: ");
            //int a = input.nextInt();
            //System.out.print("İkinci sayıyı giriniz: ");
            //int b = input.nextInt();


            switch (select){
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    fact();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    area();
                    break;
                default:
                    System.out.println("Yanlış değer girdiniz lütfen tekrar deneyein!");
            }
        }while(select != 0);

    }
}
