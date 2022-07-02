import java.util.Arrays;

public class ElemanlarınFrekansı {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20,6,3,3,3,3,8};
        int count = 1;
        Arrays.sort(dizi);

        for(int i = 0 ;i<dizi.length; i++){
            if (i <dizi.length-1){
                if(dizi[i] == dizi[i+1]) {
                    count++;
                }else{
                    System.out.println(dizi[i]+ " sayısı " + count + " kere tekrar edildi!");
                    count=1;
                }
            }else{
                if(dizi[i] == dizi[i-1]){
                    count++;
                    System.out.println(dizi[i]+ " sayısı " + (count-1) + " kere tekrar edildi!");
                }else{
                    System.out.println(dizi[i] + "'den 1 tane vardır!");
                }
            }

        }
    }

}
