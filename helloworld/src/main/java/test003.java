package helloworld.src.main.java;

class Animal01{
    private String name;
    private int age;
    private double price;
    private double weight;
    private String color;

    //添加有参构造方法
    public Animal01(String n,int a,double p,double w,String c){
        System.out.println("调用了有参构造函数");
        name = n;
        age = a;
        price = p;
        weight = w;
        color = c;
    }

    //添加无参构造函数，又叫做“重载
    public Animal01(){
        System.out.println("调用了无参构造函数");
    }

    //添加set、get方法
    public void setName(String n){
        name = n;
        System.out.println("this is setName");
    }

    public String getName(){
        System.out.println("this is getName");
        return name;
    }

    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return age;
    }

    public void setPrice(double p){
        price = p;
    }

    public double getPrice(){
        return price;
    }

    public void setWeight(double w){
        weight = w;
    }

    public double getWeight(){
        return weight;
    }

    public void setColor(String c){
        color = c;
    }

    public String getColor(){
        return color;
    }

    //添加getinfo方法获取信息
    public String getInfo(){
        return "姓名："+name+"\n"+"年龄："+age+"\n"+"价格："+price+"\n"+"体重："+weight+"\n"+"颜色："+color+"\n";
    }
}
public class test003 {
    public static void main(String args[]){
        //实例化对象时候调用有参构造方法，初始化属性值
        Animal01 dog = new Animal01("泰日天", 2,888.8,12.1,"Brown");
        //打印信息
        System.out.println(dog.getInfo());

        /*//通过重载，重新定义属性（这段代码举例重载并不好，根据网上教程，单独编写个文件来学习重载）
//        Animal01 dog = new Animal01();        // 已经实例化了，不能再次实例化了
        dog.setColor("Red");
        System.out.println("调用无参构造器后，重新定义颜色的狗的属性："+"\n"+dog.getInfo());*/

        //实例化对象时，调用无参构造函数
        Animal01 cat = new Animal01();
        //通过setXX设置对象属性
        cat.setName("加菲猫");
        cat.setAge(1);
        //打印信息
        System.out.println(cat.getInfo());      //没有设置数值的字段，int的值默认为0，double的值默认为0.0，String的值默认为null
        System.out.println("单独调用getName方法来获取猫的名字："+cat.getName());
    }
}


/*
通过以上代码，当Java文件手工添加构造函数时，编译Java文件时，不再默认添加无参构造函数；当Java文件没有任何构造函数，编译Java文件时，会自动添加无参构造函数；
通过以上代码，只添加了有参构造函数，每次在实例化对象的时候，必须传递参数；
疑问：实例化对象时候如果不赋予初始化值，只能调用无参构造函数，此时类中同时出现有参构造函数及无参构造函数，称为“重载”；
重载的特点：
1、方法名一样、参数个数及参数类型不一样；
新写一个文件来学习重载
*/