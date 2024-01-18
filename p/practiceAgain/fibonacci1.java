import java.util.Scanner;

public class fibonacci1 {

    static void Fibonacci(int num){
        int num1=0,num2=1,num3;
        int count=0;
        while(count<num){
            System.out.print(num1+" ");
            num3=num1+num2;
            num1=num2;
            num2=num3;
            count++;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        Fibonacci(num);
    }
}
