public class bubbleSort1 {
    public static void main(String[] args){
        int[] arr = {5,7,6,2,9,11,10};
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int elementCount = n-i;
            for(int j=0;j<elementCount-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After Sorting the array looks like");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
