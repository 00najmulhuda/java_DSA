import java.util.Scanner;

public class LoopDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter no. :");
        int a = sc.nextInt();

        for(int i = 1; i <= a; i++){
            System.out.println(i);
        }
    }
}