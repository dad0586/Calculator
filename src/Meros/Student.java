package Meros;

public class Student extends Person{
    private int level;

    public Student() {

    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.level;
    }
}
