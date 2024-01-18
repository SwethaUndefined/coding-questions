public class binarySeachToFindTheElementPresentOrNot {
        static int binarySearch(int arr[],int searchElement){
            int left=0,right=arr.length-1;
            while(left<=right){
                int mid=(left+right)/2;
                if(arr[mid]==searchElement){
                    return mid;
                }
                else if(arr[mid]>searchElement){  //
                    right=mid-1;
                }
                else if(arr[mid]<searchElement){
                    left=mid+1;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int searchElement = 3;
        int ans = binarySearch(arr,searchElement);
        System.out.println(ans);
    }
}
