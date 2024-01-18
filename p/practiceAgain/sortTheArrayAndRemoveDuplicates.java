public class sortTheArrayAndRemoveDuplicates {
    public static void main(String[] args) {
        int[] arr ={5,7,9,8,3,5,14,11,8};
        int n=1;
        int[] tempArr = new int[n];
        int duplicateIndex=0;
        for(int i=0;i<arr.length;i++){
            int minValue=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minValue]){  
                    minValue=j;  
                    if(arr[j]==minValue){ 
                     tempArr[n-1] =j;
                     n++; 
                     System.out.println(arr[j]+ " ");
                    }
                    else{
                    int temp=arr[i];
                    arr[i]=arr[minValue];
                    arr[minValue]=temp;
                    }
                }
            }
        }
        System.out.println("After find the duplicate element, array is sorted in the form of");
        /*for(int i=0;i<arr.length;i++){
            if(i!=duplicateIndex){
                System.out.print(arr[i]+" ");
            }
        }*/
    }
}
