package task_program.ArrayTAsk;

public class LargestArrayElement {
    public static void main(String[] args) {
        int[] arr={12,3,4,5,6,7,8,9,10,11};
        int largest=0;
        for(int i=0;i< arr.length;i++){
            if (arr[i]<largest);
            largest=arr[i];
        }
        System.out.println(largest);
    }
}
