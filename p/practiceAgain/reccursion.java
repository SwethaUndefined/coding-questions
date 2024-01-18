public class reccursion {
    public static void main(String[] args){
        String name="welcome";
        torecursion(name);
    }
    static void torecursion(String name){
    System.out.println(name);
    torecursion(name);
    }
}
