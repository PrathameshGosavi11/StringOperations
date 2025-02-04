public class StringMethod {
    public static void main(String[] args) {
        
        String str1="hello java";
        System.out.println("Before converting the cases:"+str1);
        String result=str1.toUpperCase();
        System.out.println("after apply the case conversion:"+result);

        System.out.println("before conversion the lowercase:"+result);
        System.out.println("after apply case conversion:"+result.toLowerCase());

        System.out.println("access String character:"+str1.charAt(1)); //e
        System.out.println("acces specific chafracter:"+str1.charAt(5)); //spaces
        System.out.println("access spefic:"+str1.charAt(6));//j

       

    }
}
