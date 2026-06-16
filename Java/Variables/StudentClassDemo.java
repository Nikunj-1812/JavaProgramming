package Variables;

class student{
    String name = "John Doe";

    void display() {
        System.out.println("Name: " + name);
    }
}
public class StudentClassDemo{
    public static void main(String[] args) {
        student s = new student();
        System.out.println("Name: " + s.name);
        s.display();
    }
}
