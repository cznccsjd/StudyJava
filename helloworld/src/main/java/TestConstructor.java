package helloworld.src.main.java;
/*
在构造器中可以调用本类的其他重载构造器，不能使用构造器名称来调用另一个构造器，而是应该使用Java特定的this（...）来调用。
this(...)方法必须出现在构造器中的第一行，用来调用其他重载构造器。调用时参数必须严格匹配。
种种调用方式的有点在于一个狗仔起可以不必重复编写其他构造器中已有的代码，而是通过调用其他构造函数已实现复用，从而提供良好和类代码结构*/

class Teacher {
    private String name;
    private String gender;
    private int age;

    public Teacher(String name){
        this(name,"男");
        System.out.println("第一行构造器");
    }

    public Teacher(String name, String gender){
        this(name,gender,45);
        System.out.println("第二行构造器");
    }

    public Teacher(String name,String gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
        System.out.println("第三行构造器");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setAge(int age){
        if (age > 100){
            return;
        }
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void lectrue(){

    }

    public void doExec(){

    }

    public String say(){
        String str = "我是" + name + "，性别" + gender + "，年龄" + age;
        return str;
    }
}



public class TestConstructor{
    public static void main(String[] args){
        System.out.println("Begin...");
        Teacher english = new Teacher("jlz");
        System.out.println(english.say());          //对执行结果有疑义的话，debug一下就懂了

//        Teacher math = new Teacher("Tim", "女");
//        System.out.println(math.say());

//        Teacher history = new Teacher("Kity","女",50);
//        System.out.println(history.say());
    }
}
