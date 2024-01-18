public class mergeSort1 {

    static void mergeSort(int arr[], int left, int right){
        if(left<right){           
            int mid = (left+right)/2; 
            mergeSort(arr, left, mid); 
            mergeSort(arr, mid+1, right);
            merge(arr,left,mid,right);
        }
    }
    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right-left+1];
        int leftArrayPointer = left;
        int rightArrayPointer = mid+1;
        int k=0;
        while(leftArrayPointer<=mid && rightArrayPointer<=right){ 
            if(arr[leftArrayPointer]<arr[rightArrayPointer]){  //5<9 5stored 7<9 7stored 6<9 6stored 2<9 2 stored
    //After ist while loop completed the array becomes 5,7,6,2,[left array completed so right arrays are
    //are stored as it is 5,6,2,9,11,10]
                temp[k]= arr[leftArrayPointer];
                leftArrayPointer++;
                k++;
            }
            else{
                temp[k]=arr[rightArrayPointer];
                rightArrayPointer++;
                k++;
            }
        }
        while(leftArrayPointer<=mid){
            temp[k]= arr[leftArrayPointer];
                leftArrayPointer++;
                k++;
        }
        while(rightArrayPointer<=right){
            temp[k]=arr[rightArrayPointer];
                rightArrayPointer++;
                k++;
        }
        for(int i=0;i<temp.length;i++){
            arr[left+i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,7,6,2,9,11,10};
        mergeSort(arr,0,arr.length-1);
        System.out.println("After Sorting the array looks like");
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
    }
}
