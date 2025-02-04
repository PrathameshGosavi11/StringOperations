import java.util.Scanner;

public class Length {
  public static void main(String[] args) {
    
    Scanner scanner=new Scanner(System.in);
    System.out.println(":Ente the name and password");
    String name=scanner.nextLine();
    String password=scanner.nextLine();

    if(name.length()==5 && password.length()==5)
    {
        System.out.println("name is valid");
    }
    else
    {
        System.out.println("you are not enter correct details");
    }
  }  
}
