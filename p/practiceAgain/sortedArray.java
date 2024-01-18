import java.util.Scanner;
public class sortedArray {
    public static void main(String[] args) {
        int[] arr1 = {5,7,2,4};       
        int[] arr2 = {4,2,3,14};
        
        mergeSortedArrays(arr1, arr2);
    }

    public static void mergeSortedArrays(int arr1[], int arr2[]) {
        int result;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    result = arr1[i];
                    System.out.print(arr1[i]+" ");
                }

            }
        }
    }
}
