public class Variable{
    public static void main(String[] args) {

        String name = "Najmul Huda";
        int age = 23;
        double cgpa = 8.0;

        System.out.println(name);
        System.out.println(age);
        System.out.println(cgpa);
    }
}

// Better Printing

class Student{
    public static void main(String[] args) {
        
        String name = "Najmul Huda";
        int age = 22;
        double cgpa = 8.0;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);

        age = 23;//no need to declare int becasue already declared here age update only

        System.out.println("updated age : " + age);
    }
}