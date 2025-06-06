package task_program.ArrayTAsk;

public class SecondSmallestArray {
    public static void main(String[] args) {
        int[] arr={45,67,89,12,34,56,58};
        int n= arr.length;
        int smallest=0;
        for(int i=1;i<n-1;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
            System.out.println(smallest);
        }

    }
}
