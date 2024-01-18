import java.util.Scanner;

public class fibonacciRecusrion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(toFibonacci(num));
    }
    static int toFibonacci(int num){
        if(num==0) return 0;
        if(num==1) return 1;
        return toFibonacci(num-1)+toFibonacci(num-2);
        }
}
