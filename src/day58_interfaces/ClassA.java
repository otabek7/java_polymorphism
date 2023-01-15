package day58_interfaces;

public class ClassA implements Cloneable{

    @Override
    public Object clone(){
        System.out.println("Cloning");
        return null;
    }
}
