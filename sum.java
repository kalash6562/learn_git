import java.util.Scanner;

public class sum{
    public static void main(String []args){
        try (Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b= sc.nextInt();
            System.out.println("The sum of the two numbers is: "+ (a+b));

        }
    }
}