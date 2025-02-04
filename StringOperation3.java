public class StringOperation3
{
    public static void main(String[] args) {
        
        String s1=new String("ajay");
        String s2=new String("ajay");

        String s3="nitin";
        String s4="nitin"; 

        boolean result=s1==s2;
        System.out.println(result);

        boolean result2=s3==s4; //check the address of reference variabel
        System.out.println(result2);
    }
}