package Meros;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Ali");
        student.setSurname("Aliyev");
        student.setAge(22);
        student.setLevel(2);

        Teacher teacher = new Teacher();
        teacher.setName("Ali");
        teacher.setSurname("Aliyev");
        teacher.setAge(22);
        teacher.setSubject("Math");
        System.out.println(teacher);
        System.out.println(student);
    }
}
