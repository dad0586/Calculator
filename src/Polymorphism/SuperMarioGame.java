package Polymorphism;

public class SuperMarioGame extends MarioGame{
    @Override
    public void start() {
        System.out.println("SuperMarioGame : start ");
    }

    @Override
    public void jump() {
        System.out.println("SuperMarioGame : jump ");
    }
}
