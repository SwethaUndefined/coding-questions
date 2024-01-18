public class findDuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,7,14,24,28,28};
        int duplicateValue=0;
        for(int i=0;i<arr.length;i++){
            int duplicateIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[duplicateIndex]){
                 arr[j]=duplicateValue;
                }
            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=duplicateValue){
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
