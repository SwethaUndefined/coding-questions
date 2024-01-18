public class maxNumbersInArray{
    public static void main(String[] args) {
        int[] arr={20,45,75,101,96,35,85};
        int minValue=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>minValue){
             minValue=arr[i];
            }
        }
        System.out.println(minValue);
    }
}