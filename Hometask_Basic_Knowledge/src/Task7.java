import java.util.Arrays;
import java.util.List;

public class Task7 {

    public static String function(long number){
        String ip_adress = "";
        String binary = Long.toBinaryString(number);
        if (binary.length() > 32){
           return "Exception";
        }
        while(binary.length() < 31){
            binary = "0" + binary;
        }

        String[] binary_numbers_String =  binary.split("(?<=\\G.{8})");

        //List<Integer> binary_numbers_Int = null;
        for (String s: binary_numbers_String){
            //binary_numbers_Int.add(Integer.parseInt(s,2));
            ip_adress += Integer.parseInt(s,2) + ".";
        }

        return ip_adress;
    }


    public static void main(String[] args) {
        long num = 2149583361L;
        System.out.println(function(num));
    }
}
