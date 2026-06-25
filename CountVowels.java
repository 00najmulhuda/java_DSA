import java.util.Scanner;

public class CountVowels{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word for Vowels count: ");
        String word = sc.nextLine();
        word = word.toLowerCase();
        int count = 0;

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("vowels :" + count);
    }
}