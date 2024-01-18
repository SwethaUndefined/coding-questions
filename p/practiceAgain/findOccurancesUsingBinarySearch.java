public class findOccurancesUsingBinarySearch {
    static int endingIndex(int[] arr,int searchElement){
        int left=0,right=arr.length-1;
        int ans = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==searchElement){
                ans = mid;
                left=mid+1;
            }
            else if(arr[mid]>searchElement){
                right=mid-1;
            }
            else if(arr[mid]<searchElement){
                left=mid+1;
            }
        }
        return ans;
    }
    static int startingIndex(int[] arr,int searchElement){
        int left=0,right=arr.length-1;
        int ans = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==searchElement){
                ans = mid;
                right=mid-1;
            }
            else if(arr[mid]>searchElement){
                right=mid-1;
            }
            else if(arr[mid]<searchElement){
                left=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,6,7,8};
        int searchElement=5;
        int lIndex = startingIndex(arr,searchElement);
        int rIndex = endingIndex(arr,searchElement);
        if(lIndex==-1){
            System.out.println("0 times");
        }
        else{
            System.out.println((rIndex-lIndex+1) + "times");
        }
    }
}
