public class StringOperation {
    
    public static void main(String[] args) {
        
        String name="Java";

        String name1="Java";

        //== check the address  of reference variable
        if(name==name1)
            System.out.println("Both are point same memory area.");
        else
        {
            System.out.println("both are not point same memory area.");
        }
           
    }
}
