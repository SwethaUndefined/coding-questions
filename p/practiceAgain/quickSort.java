public class quickSort {
    
    static int partition(int[] arr,int left,int right){
        int pivotElement=arr[right];
        int pIndex=left;
        for(int i=left;i<right;i++){
            if(arr[i]<pivotElement){
                int temp=arr[i];
                arr[i]=arr[pIndex]; //5<10,7<10,6<10,2<10,9<10 yes  11<10 No ->5,7,6,2,9  11,10
                arr[pIndex]=temp;
                pIndex++;
            }
        }            
        int temp=arr[pIndex];
        arr[pIndex]=arr[right];
        arr[right]=temp;   //5,7,6,2,9,10,11
    return pIndex; //holding value 10
}
    static void quickSort(int[] arr, int left,int right){ //arr,0,4
        if(left<right){   //0<4
            int pIndex = partition(arr,left,right);  //arr,0,4
            quickSort(arr, left, pIndex-1);  //0,index 6-1
            quickSort(arr, pIndex+1, right); //0,index 6+1
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,7,6,2,9,11,10};
        quickSort(arr,0,arr.length-1);
        System.out.println("After Sorting the array looks like");
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
    }
}
