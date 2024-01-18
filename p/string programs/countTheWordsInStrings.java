public class countTheWordsInStrings {
    
    public static void main(String[] args)
    { 
        String str = "Hello all how are you";
 
        int count = 1;
 
        for (int i = 0; i < str.length()-1; i++)
        {
            if((str.charAt(i) == ' ') && (str.charAt(i+1) != ' '))
            {
                count++;
            }
        }
 
        System.out.println("Number of words in a string = "+count);
        //StringBuilder sb = new StringBuilder(str);
        //System.out.println(sb.reverse());
       /* String[] arr = str.split(" ");
        System.out.println(arr.length);
        str=str.replaceAll("\\s", "");
        System.out.println(str);*/
    }
}
