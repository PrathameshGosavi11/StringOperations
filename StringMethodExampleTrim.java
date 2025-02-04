public class StringMethodExampleTrim {
    public static void main(String[] args) {
        
        String str1="  Pune  ";
        

        System.out.println("String length:"+str1.length()); //6
        System.out.println("before eliminate the spaces:"+str1); //--pune--
        String eliminateSpace=str1.trim(); //pune
        System.out.println(" before eliminate the space:"+eliminateSpace); //Pune
       

        
    }
}
