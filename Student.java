public class Student{
    String name;
    int age;
    double cgpa;

    Student(String name, int age, double cgpa){
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }
    void display(){
        System.out.println(name + " " + age + " " + cgpa);
    }

}