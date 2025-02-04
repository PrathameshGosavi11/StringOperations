public class StringOp {
    public static void main(String[] args) {
        
        String str1="Java";
        String str2="Java";

        if(str1==str2)
            System.out.println("both are point same memory area:");
        else
            System.out.println("not same ");

        String str3=new String("Java");
        String str4=new String("Java");

        if (str3==str4)
            System.out.println("both are equals");
        System.out.println("both are not equals");

        //checks the content of object:

        if(str1.equals(str2))
            System.out.println("both are same ");
        else
            System.out.println("both are not same");

   }
}
