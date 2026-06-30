import java.util.Scanner;

public class LargestofThree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ENter A :");
        int a = sc.nextInt();

        System.out.print("Enter B :");
        int b = sc.nextInt();

        System.out.print("Enter C :");
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println(a + ": A is largest");
        }
        else if(b > a && b > c){
            System.out.println(b + " : B is largest");
        }
        else{
            System.out.println(c + " : C is largest");
        }
    }
}

class FindLargest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENter a : ");
        int a = sc.nextInt();

        System.out.print("ENter b : ");
        int b = sc.nextInt();

        System.out.print("ENter c : ");
        int c = sc.nextInt();

        if(a >= b && a >= c){
            System.out.println(a +  ": a is largest");
        }
        else if(b >= a && b >= c){
            System.out.println(b +  ": b is largest");
        }
        else{
            System.out.println(c +  ": c is largest");
        }


    }
}