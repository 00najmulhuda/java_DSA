import java.util.Scanner;


public class LargestNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st no. :");
        int a = sc.nextInt();
        
        System.out.print("ENter 2nd no. :");
        int b = sc.nextInt();

        if(a > b ){
            System.out.println("a is largest");
        } 
        else{
            System.out.println("b is largest");
        }
    }
}