package Meros;

public class Teacher extends Person{
    private String subject;

    public Teacher() {

    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString()+" "+ this.subject;
    }
}
