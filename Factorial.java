import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter factorial no. :");
        int n = sc.nextInt();

        int fact = 1;

        for(int i = 1; i <=n ; i++){
            fact = fact * i;
            
        }
        System.out.println(fact);
    }
}

//if ques print each calculation
class ExpandFact{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fact = 1;

        for(int i = 1; i <= n; i++){
            fact = fact *i;
            System.out.println(fact);
        }
        System.out.println("Final factorial value : " + fact);
    }
}