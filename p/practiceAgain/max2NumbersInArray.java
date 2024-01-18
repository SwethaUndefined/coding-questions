public class max2NumbersInArray {
    public static void main(String[] args) {
        int[] arr ={65,85,74,20,45,91,65};
        int firstElement, secondElement;
        if(arr[0]>arr[1]){
            firstElement=arr[0];
            secondElement=arr[1];
        }
        else{
        firstElement=arr[1];
        secondElement=arr[0];
    }
    for(int i=2;i<arr.length;i++){
        if(arr[i]>firstElement){
            secondElement=firstElement;
            firstElement=arr[i];
        }
        else if(arr[i]<firstElement && arr[i]> secondElement){
        secondElement = arr[i];
        }
    }
    System.out.println("MaximumElement " +firstElement + " " + "and" + " " +"SecondMaximumElement " + secondElement);
}
}
