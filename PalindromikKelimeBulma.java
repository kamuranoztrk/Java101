import java.util.Scanner;

public class PalindromikKelimeBulma {

    static boolean isPalindrome(String str){
        int i= 0;
        int j = str.length() - 1;

        while ( i<j) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kelime= "";

        while ( !kelime.equals("0")){
            System.out.print("Palindromik olup olmadığını öğrenmek istediğiniz kelimeyi giriniz:");
            kelime = input.next();
            if(isPalindrome(kelime) && !kelime.equals("0")){
                System.out.println("* " + kelime + " palindrom bir kelimedir.");
            }else if(!isPalindrome(kelime) && !kelime.equals("0")){
                System.out.println("* " + kelime + " palindrom bir kelime değildir.");
            }
            System.out.println();
        }
        System.out.println("Program bitti");
    }
}
