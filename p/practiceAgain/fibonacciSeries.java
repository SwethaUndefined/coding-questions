public class fibonacciSeries{
    public static void main(String[] args) {
        int N=10;
        fibonacci(N);
    }
    static void fibonacci(int N){
        int n1=0,n2=1,n3,count=1;
        while(count<=N){
            System.out.print(n1+" ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
            /*if(n1==5){ // Stop till value will print 5, if need to print all the numbers then remove if statement
                break;
            } */
            count++;
        }

    }
}