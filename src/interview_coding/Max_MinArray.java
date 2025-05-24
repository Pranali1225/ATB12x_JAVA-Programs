package interview_coding;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Max_MinArray {
    public static void main(String[] args) {
        int [] arr={23,70,12,34,56,78};
        int n=arr.length;
        //max
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
            largest=arr[i];
        }}
        System.out.println(largest);

        //min value
        //Arrays.sort(arr);
        int smallest=arr[0];
        for(int i=1;i<n;i++){
            if( arr[i]<smallest){
            smallest=arr[i];
        }}
        System.out.println(smallest);
    }

}
