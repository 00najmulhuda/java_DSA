
import java.util.Scanner;

public class IfElseDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age :");

        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Eligible for vote");
        }
        else{
            System.out.println("Minor");
        }

    }
}

class PassFail{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks:");

        int marks = sc.nextInt();

        if(marks >= 40){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}