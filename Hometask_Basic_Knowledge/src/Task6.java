import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task6 {
    private static int getBigger(int a) {
        int aToCheck = a;
        StringBuilder resultString = new StringBuilder();
        if (a > 9) {
            List<Integer> list = new ArrayList<>();
            while (a > 0) {
                list.add(a % 10);
                a = a / 10;
            }

            for(int i = 0; i < list.size(); i++)  {
                if(list.get(i) > list.get(i + 1)){
                    Collections.swap(list, i, i +1);
                    break;
                }
            }
            Collections.reverse(list);

            for (Integer integer : list) {
                resultString.append(integer);
            }
            int result = Integer.parseInt(resultString.toString());
            if (result > aToCheck) {
                return result;
            } else return -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int a = 55455;
        System.out.println(getBigger(a));
    }
}