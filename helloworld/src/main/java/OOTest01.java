package helloworld.src.main.java;

public class OOTest01 {
    public static void main(String[] args){
        //1、创建对象
        //下面的stu1是局部变量，这个局部变量stu1是student类型，也就是引用类型
        //stu1该局部变量乘坐引用，引用中保存了对象在堆中的内存地址
        //通过“引用”去间接访问
        Student stu1 = new Student();   //实例化第一个对象
        //一个类型可以创建多个对象
        Student stu2 = new Student();       //实例化第二个对象

        int i = 10;

        //2.使用对象
        //下面的代码直接访问name，是有问题的(提示无法从静态上下文中引用非静态变量)；访问成员变量，必须使用“引用”
//        name是成员变量，对象相关，必须先有对象才能访问
//        System.out.println(Student.name);

        //给成员变量进行赋值
        stu1.id = 10001;
        stu1.name = "ZhangSan";
        stu1.age = 15;
        stu1.sex = true;
        stu1.addr = "Haidian Direct, Beijing";

        System.out.println("id:"+stu1.id);
        System.out.println("name:"+stu1.name);
        System.out.println("addr:"+stu1.addr);
        System.out.println("age:"+stu1.age);
        System.out.println("sex:"+stu1.sex);

        /*
        关于系统默认值类型
        基本类型
                byte,short,int,long 默认值为 0
                float,double 默认值为 0.0
                boolean,false 默认值为 false
                char 默认值为 \u0000
        */
    }
}
