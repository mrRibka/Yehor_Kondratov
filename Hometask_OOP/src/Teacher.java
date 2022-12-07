public class Teacher extends Person{
    private String subject;

    public Teacher(String first_name, String last_name, int age, String subject) {
        super(first_name, last_name, age);
        this.subject = subject;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(", teacher of " + subject);
    }
}
