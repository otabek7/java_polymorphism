package day59_polymorphism;

public class Triangle extends Shape{

    @Override
    public void draw() {
        System.out.println("  ~ ");
        System.out.println(" ~ ~ ");
        System.out.println("~~~~~");
    }
}
