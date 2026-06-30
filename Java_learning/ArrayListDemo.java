import java.util.ArrayList;

public class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        
        System.out.println(list.get(0));
    }
}

class ArrayListSet{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        System.out.println(list.set(1, 25));
        System.out.println(list);
    }
}
class ListSize{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list.size());
        System.out.println(list.contains(20));
    }
}

class ArrayListStr{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();

        list.add("najmul");
        list.add("Huda");
        list.add("Java");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("Najmul"));
    }
}