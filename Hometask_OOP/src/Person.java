public class Person {
    private String first_name;
    private String last_name;
    private int age;
    public Person(String first_name, String last_name, int age){
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }
    public void display(){
        System.out.print(first_name + " " + last_name + ": " + age);
    }

}
