import java.util.ArrayList;

public class Task1 {

    public static ArrayList getIntegersFromList(ArrayList arr) {

        for(int i = 0; i < arr.size(); i++){
            if (arr.get(i) instanceof String){
                arr.remove(i);
                i--;
            }
        }
        return arr;
    }

    public static void main(String[] arg) {

        ArrayList var1 = new ArrayList();
        var1.add("kk");
        var1.add(1);
        var1.add(2);
        var1.add("aa");
        var1.add(12);
        var1.add("ss");

        System.out.println(getIntegersFromList(var1));
    }
}
