import java.util.Arrays;

public class TekrarEdenCİftSayilar {
    static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {2, 5, 6, 4, 2, 6, 6, 4, 4, 8, 1, 1, 15, 17, 12, 12, 5, 12};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for ( int i = 0; i < list.length; i++){
            for(int j = 0 ; j < list.length; j++){
                if((i != j) && list[i] == list[j]){
                    if (!isFind(duplicate , list[i])){
                    duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for(int value : duplicate){
            if((value != 0) && ( value % 2 == 0)){
                System.out.println(value);
            }
        }
    }
}
