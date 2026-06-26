import java.util.Scanner;

public class CountWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter words : ");
        String word = sc.nextLine();

        int count = 1;

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(ch == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}