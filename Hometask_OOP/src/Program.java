import java.util.LinkedList;

public class Program {
    public static void main(String [] args){
        LinkedList<Person> people = new LinkedList<>();
        people.add(new Student("Yehor", "Kondratov", 19, "IASA", "KA-04"));
        people.add(new Student("Dima", "Strikker", 18, "IASA", "KA-05"));
        people.add(new Teacher("Petro", "Petrenko", 35, "Maths"));
        for (Person person : people){
            person.display();
        }
    }
}
