public class selectionSort1 {
    public static void main(String[] args){
        int[] arr = {5,7,6,2,9,11,10};
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int minValue  = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minValue]){
                    minValue=j;
                }
            }    
            int temp = arr[i];
            arr[i]=arr[minValue];
            arr[minValue]=temp;    
}
System.out.println("After Sorting the array looks like");
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
    }
}