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

class EvenNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int a = sc.nextInt();

        for(int i = 2; i <= 20; i = i + 2){
            System.out.println(i);
        }
    }
}

class OddNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENter no. : ");
        int n = sc.nextInt();

        for(int i = 3; i <=10; i = i + 3){
            System.out.println(i);
        }
    }
}