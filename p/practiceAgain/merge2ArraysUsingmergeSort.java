public class merge2ArraysUsingmergeSort {
    public static void main(String[] args) { //divide into 2 parts and then sorted individually and then merge
        int[] arr = {6,5,3,1,2,4,7,8}; //divide till getting one element, means one element is sorted
        toMerge(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
    
    }
    static void toMerge(int arr[], int left,int right){
        while(left<right){
            int midValue=(left+right)/2;
            toMerge(arr, left, midValue);
            toMerge(arr, midValue+1, right);
            merge(arr,left, midValue,right);
        }
    }
     static void merge(int[] arr, int left, int midValue, int right) {
        int[] temp=new int[right-left+1];
        int leftArrayPointer=left;
        int rightArrayPointer=midValue+1;
        int k=0;
    }
}   
