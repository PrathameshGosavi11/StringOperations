public class StringOpe {

    public static void main(String[] args) {
        
        String s1=new String("jay"); //point 100 --> jay

        String s2=new String("jay"); //poitn 200 -->jay

        if(s1==s2) 
        {
            System.out.println("both are same");
        }
        else
        {
            System.out.println("not same");
        }

        boolean result= s1.equals(s2);
        System.out.println(result);
    }
}