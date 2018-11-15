package helloworld.src.main.java;
//定义现实世界中的学生类型
//定义Student是一个类，一种引用类型
//概念上的一个定义，现实世界中不存在
public class Student {
    //属性

    //学号
    int id;     //成员变量、实例变量、非静态变量   //id是对象级别的，必须先有对象才能访问，不能使用类直接访问
    //姓名
    String name;        //不能直接访问类变量  Student.name;(因为name是对象的属性，不是类的属性）
    //性别
    Boolean sex;
    //年龄
    int age;
    //住址
    String addr;

    //方法
}
