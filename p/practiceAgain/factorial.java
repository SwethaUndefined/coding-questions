import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int ans = toFactorial(num);
        System.out.println(ans);
    }

     static int toFactorial(int num) {
        /*int answer = 1;  // using without recursion
        for(int i=1;i<=num;i++){
            answer=answer*i;
        }
        return answer;*/
        if(num==1) return 1;  //factorial using recursion
        return (num*toFactorial(num-1));
    }
}
