import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] weekdays = new String[7];
        System.out.println(Arrays.toString(weekdays));



        // create array and add +1 on each element in array

        int[] numbers = new int []{1,2,3,4,5,6,7,8,9};

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = numbers[i] +1;
            System.out.println(numbers[i]);
        }
        System.out.println(Arrays.toString(Arrays.stream(numbers).toArray()));
    }
}


