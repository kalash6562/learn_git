import java.util.Scanner;

public class difference {
    public static void main(String []args){
        try(Scanner sc= new Scanner(System.in)){
            int var1 = sc.nextInt();
            int var2 = sc.nextInt();
            if(var1>var2){
                System.out.println("The difference between two numbers is: "+(var1-var2));
            }
            else{
                System.out.println("The difference between two numbers is: "+(var2-var1));
            }
        }
    }
    
}
