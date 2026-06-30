public class MethodDemo{
    static void greet(){
        System.out.println("Najmul Huda");
    }

    public static void main(String[] args) {
        greet();
        greet();
    }
}

class Info{
    static void information(){
        System.out.println("Name : Najmul");
        System.out.println("Age : 23");
        System.out.println("College : S.I.E.T");
    }
    public static void main(String[] args) {
        information();
    }
}

class PrintName{
    static void printname(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        printname("Najmul");
        printname("Huda");
        printname("Noor");
    }
}