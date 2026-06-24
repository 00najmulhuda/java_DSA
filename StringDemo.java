public class StringDemo{
    public static void main(String[] args) {
        String name = "Najmul Huda";

        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf('N'));

    }
}
class ReverseStr{
    public static void main(String[] args) {
        String name = "JAVA";

        for(int i = name.length()-1; i >=0; i--){
            System.out.print(name.charAt(i));
        }
    }
}