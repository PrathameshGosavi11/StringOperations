public class StringIntro
{
    public static void main(String[] args) {
        

        String name="Banty"; 
        // internally store like array ['P','r','a','t','h','a','m','e','s','h']
        System.out.println("String name is:"+name);

        String firstName="nanty";
        System.out.println("Sting name is:"+firstName);

        if(name.equals(firstName))
        {
            System.out.println("both are same address");
        }
        else
        {
            System.out.println("both are not point same");
        }
    }

}