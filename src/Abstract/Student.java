package Abstract;

public class Student extends Person{
    @Override
    public void print() {
        System.out.println("PRINT");
    }

    @Override
    public void getInfo() {
        System.out.println("GETINFO");
    }

//    @Override
//    public void test() {
//        System.out.println("TEST");
//    }
}
