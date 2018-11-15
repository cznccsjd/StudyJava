package helloworld.src.main.java;
//定义一个顾客类型
/*
通过下面的例子，可以看到面向对象的封装性是指：
1、属性私有化；
2、对外提供setter 和 getter方法；
3、set方法和get方法的方法名应该遵循规范，Java规范中，set方法是小写的set+属性第一个字母大写；
* */
public class Customer {
    //创建属性（成员变量）
    //创建成员变量
//    int age;            //Customer01.java中，可以任意给age赋值
    private int age;    //private修饰的数据只能在本类中访问，外部程序不能访问，导致外部程序直接报错（eg,java:age可以在helloworld.src.main.Customer中访问private）
    //解决上面外部程序不能访问问题，对外提供两个方法（get set）
    public int getAge(){        //不带static叫做成员方法，带有static叫做静态方法，成员方法必须使用“引用.”方法访问
        return age;
    }

    public void setAge(int _age){       //_age先暂时这样写，后面学习后就了解了
        if(_age<0 || _age>100){
            System.out.println("年龄不合法，不要为负数，也不要大于100.");
            return;     //返回为空，调用时默认返回0
        }
        age=_age;
    }
}
