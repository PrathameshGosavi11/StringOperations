public class StringCompareInterface {
    
    public static void main(String[] args) {
        
        String str1="Hello";
        String str2="Hii";

        int result=str1.compareTo(str2);
        if(result==0)
            System.out.println("both are same");
        System.out.println("not a same");
    }
}
