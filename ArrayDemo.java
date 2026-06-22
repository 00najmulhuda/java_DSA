public class ArrayDemo{
    public static void main(String[] args) {
        
        int [] arr = {10,20,30,40};
        System.out.println(arr[0]);
        System.out.println(arr[3]);
    }
}
class ArrayLoop{
    public static void main(String[] args) {
        int [] arr = {100,200,300,400};

        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}