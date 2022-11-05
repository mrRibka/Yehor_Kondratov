public class Task2 {

    public static char first_non_repeating_letter(String line){
        char result_letter = ' ';
        char[] line_char = line.toCharArray();

        for (int i = 0;i < line_char.length;i++){
            result_letter = line_char[i];
            for (int j = 0;j < line_char.length;j++){
                if(Character.toLowerCase(line_char[i]) == Character.toLowerCase(line_char[j]) && i != j) {
                    result_letter = ' ';
                    break;
                }
            }
            if (result_letter == line_char[i])
                break;
        }
        return result_letter;
    }
    public static void main(String[] arg){
        System.out.println(first_non_repeating_letter("stress"));
    }
}
