import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER value :");

        int value = sc.nextInt();

        if(value % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}