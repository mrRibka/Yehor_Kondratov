public class Task3 {
    public static int digital_root(int number){
        int new_number = 0;

        while(number != 0){
            new_number += (number % 10);
            number /= 10;
        }
        if(new_number/10 >= 1) {
            new_number =  digital_root(new_number);
        }
        return new_number;
    }

    public static void main(String[] arg){
        System.out.println(digital_root(942));
    }
}
