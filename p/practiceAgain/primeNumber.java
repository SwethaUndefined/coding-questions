import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int noOfFacttors=0;
        for(int i=2;i<num-1;i++){
        if(num%i==0){
         noOfFacttors++;
         break;
        }
    }
    if(noOfFacttors==0){
        System.out.println("Prime Number");
    }
    else{
        System.out.println("Not a prime Number");
    }
}
}
