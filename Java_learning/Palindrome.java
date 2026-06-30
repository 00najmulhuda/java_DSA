import java.util.Scanner; 

public class Palindrome{
    public static void main(String[] args) {
        String word = "LEVEL";
        String reverse = "";
        for(int i = word.length()-1; i >=0; i--){
            reverse = reverse + word.charAt(i);
            
        }
        if(word.equals(reverse)){
            System.out.println(word + " : its a palindrome");
        }
        else{
            System.out.println("its not palindrome");
        }
    }
}
class InputPal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word for palidrome : ");
        String word = sc.nextLine();
        word = word.toLowerCase();
        String reverse = "";
        for(int i = word.length()-1; i>=0; i--){
            reverse = reverse + word.charAt(i);
        }
        if(word.equals(reverse)){
            System.out.println(word + ": Palindrome");
        }
        else{
            System.out.println(word + ": Not Palindrome");
        }
    }
}
class SpacePal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter word : ");
        String word = sc.nextLine();
        word = word.replace(" ", "");
        word = word.toLowerCase();

        String reverse = "";

        for(int i = word.length()-1; i >= 0; i--){
            reverse = reverse + word.charAt(i);
        }
        if(word.equals(reverse)){
            System.out.println(word + ": is Palindrome");
        }
        else{
            System.out.println("Not");
        }
    }
}