public class Pattern{
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Pattern2{
    public static void main(String[] args) {
        
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Pattern3{
    public static void main(String[] args) {
        
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
class Pattern4{
    public static void main(String[] args) {
        
        for(int i = 4; i >=1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}