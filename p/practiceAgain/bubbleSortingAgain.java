public class bubbleSortingAgain {
    public static void main(String[] args) {
        int[] arr ={14,24,8,4,7,9,29};
        int n = arr.length;
        for(int j=0;j<arr.length;j++){
        int elementCount=n-j;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
        System.out.println("After Sorting the array is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
