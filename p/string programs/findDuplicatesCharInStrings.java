public class findDuplicatesCharInStrings {
    public static void main(String[] args) {
        String str = "abcdeeffbb";//tea
        int[] arr = new int[26];
        int count =0;
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;//97-97=0-->arr[0]
            //System.out.print(arr[str.charAt(i)-'a']);
        }
        System.out.println();
        for(int i=0;i<26;i++){
            if(arr[i]>1){
                //System.out.println(arr[i]);
                count++;
                System.out.println((char)('a'+i));
            }
        } 
       System.out.println("Count of duplicate characters "+count);
    }
}
