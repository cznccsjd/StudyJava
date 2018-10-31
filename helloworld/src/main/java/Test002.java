package helloworld.src.main.java;

class Animal {
    private String name;
    private int age;
    private double price;
    private double weight;
    private String color;

    //添加无参构造方法
    public Animal(){
        System.out.println("这是无参构造方法");
    }
}

public class Test002 {
    public static void main(String args[]) {
        Animal dog = new Animal();
        System.out.println("this is dog");

        Animal cat = new Animal();
        System.out.println("this is cat");
    }
}