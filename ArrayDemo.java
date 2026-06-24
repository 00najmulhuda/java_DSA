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
class ArraySum{
    public static void main(String[] args) {
        int [] arr = {100,200,300,400};
        int sum = 0;
        for(int i = 0; i <= arr.length-1; i++){
            sum = sum + arr[i];
            
        }
        System.out.println(sum);
    }
}
class MaxArr{
    public static void main(String[] args) {
        int [] arr = {10,50,20,80,30};
        int max = arr[0];

        for(int i = 1; i <= arr.length-1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

class MinArr{
    public static void main(String[] args) {
        int [] arr = {40, 10, 70, 5, 90};
        int min = arr[0];

        for(int i = 1; i < arr.length-1; i++){
            if(arr[i] < min){
                min = arr[i];
            }

        }
        System.out.println(min);
    }
}
class ReverseArr{
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        for(int i = arr.length-1; i>=0; i--){
            int reverse_arr = arr[i];
            System.out.print(reverse_arr);
        }
    }
}