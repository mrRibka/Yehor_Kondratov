import java.util.Arrays;

public class Task4 {
    public static int function_for(int[] array, int target){
        int cnt= 0;
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length;j++){
                if (i == j)
                    continue;
                if (array[i] + array[j] == target)
                    cnt++;
            }
        }
        return cnt/2;
    }
    public static int function_stream(int[] array, int target){
        return (int)Arrays.stream(array).flatMap(x -> Arrays.stream(array).filter(y -> y + x == target )).count() / 2;
    }

    public static void main(String[] arg){
        int[] myNumbers = {1, 3, 6, 2, 2, 0, 4, 5, 4, 6};
        System.out.println(function_for(myNumbers, 5));
        System.out.println(function_stream(myNumbers, 5));
    }
}
