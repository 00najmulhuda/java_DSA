import java.util.Scanner;

public class InputDemo{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age :");

        int age = sc.nextInt();

        System.out.println("Age is :" + age);
    }
}

class Print{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter even. :");

        int even_number = sc.nextInt();
        System.out.println("Even No. is : " + even_number);
    }
}

class Numbers{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter even no. :");
        
        int even = sc.nextInt();
        int odd = sc.nextInt();
        System.out.println("even no. :" + even);
        System.out.println("odd no. :" + odd);

    }
}

class ScannerDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENter age");

        int age = sc.nextInt();
        System.out.println("age is: " + age);


    }
}

class StudentInfo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name :");
        String name = sc.next();

        System.out.print("Enter age :");
        int age = sc.nextInt();

        System.out.print("Enter CGPA :");
        double cgpa = sc.nextDouble();

        System.out.println("Name is : " + name);
        System.out.println("Age is :" + age);
        System.out.println("CGPA is :" + cgpa);
    }

}