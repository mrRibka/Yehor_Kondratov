public class Student extends Person {
    private String faculty;
    private String group;

    public Student(String first_name, String last_name, int age, String faculty, String group) {
        super(first_name, last_name, age);
        this.faculty = faculty;
        this.group = group;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(", student of " + faculty + ", " + group);
    }
}
