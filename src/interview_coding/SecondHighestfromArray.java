package interview_coding;

import java.util.Arrays;

public class SecondHighestfromArray {
    public static void main(String[] args) {
        int[] arr={12,23,45,2,56,78,90};
        int highest = 0;
        Arrays.sort(arr);
        int n= arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                highest=arr[i];
                break;
            }
        }
        System.out.println(highest);

    }
}
