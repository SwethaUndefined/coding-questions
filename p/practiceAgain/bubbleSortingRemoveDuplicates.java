public class bubbleSortingRemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,7,2,8,9,1};
        int n = arr.length-1;
        int count =0;
        int duplicateIndex=0;
        while(count<arr.length-1){
            for(int j=0; j<n; j++) { // j<n-i-1
                if(arr[j] >= arr[j+1])  {
                    if(arr[j]==arr[j+1]){
                         duplicateIndex=j;
                    }
                    else{
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
            count++;
            n--;
        }   
        System.out.println("After sorting, elements are ");
        for(int i=0; i<arr.length; i++) {
            if(i!=duplicateIndex){
            System.out.print(arr[i] + " ");
                }
            }    
        }
    }
    

