public class Main{
    public static void main(String[] args) {
        Student s1 = new Student("Najmul",23,8.0);
        Student s2 = new Student("Huda",20,8.0);

        s1.display();
        s2.display();
    }
}

class EmployeeInfo{
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.name = "Najmul";
        e1.salary = 100000;
        e1.department = "Backend developer";

        Employee e2 = new Employee();
        e2.name = "Huda";
        e2.salary= 100000;
        e2.department = "fullstack developer";

        System.out.println(e1.name + " " + e1.salary + " " + e1.department);
        System.out.println(e2.name + " " + e2.salary + " " + e2.department);

    }
}

class CarInfo{
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.brand = "BMW";
        c1.model = "x5";
        c1.price = 6000000;

        Car c2 = new Car();

        c2.brand = "Audi";
        c2.model = "A 6";
        c2.price = 8000000;

        Car c3 = new Car();

        c3.brand = "Tesla";
        c3.model = "3";
        c3.price = 5000000;

        System.out.println(c1.brand + " " + c1.model + " " + c1.price);
        System.out.println(c2.brand + " " + c2.model + " " + c2.price);
        System.out.println(c3.brand + " " + c3.model + " " + c3.price);
    }
}