public class StringComparison{
    public static void main(String[] args) {
        String a = "java";
        String b = "java";

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
class StrCom{
    public static void main(String[] args) {
        String a = new String("java");
    String b = new String("java");

    System.out.println(a == b);
    System.out.println(a.equals(b));
    }
}

class StringCaseCom{
    public static void main(String[] args) {
        String a = "Najmul";
        String b = "najmul";

        System.out.println(a == b);
        System.out.println(a.equalsIgnoreCase(b));
    }
}