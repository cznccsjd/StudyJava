package helloworld.src.main.java;

public class Customer02 {
    public static void main(String[] args) {
        //创建Customer类型对象
        Customer c = new Customer();

        //下面的代码为了验证非private修饰的变量，可以被任意修改，导致风险比较高
        /*
        //读取Customer的age属性（get）
        System.out.println("读取到的Customer类的age属性："+c.age);  //age=0
        //给age属性赋值(set)
        c.age=-10;      //因为age没有任何限制，导致外部程序可以随意访问age，导致age不安全，所以可以传入不合法的数值（eg:age=-10）
//        再次读取Customer的age属性
        System.out.println("再次读取Customer类的age属性："+c.age);   //age=10
     */

        //使用private修饰的变量，可以通过访问类提供的set和get方法，来获取值
        //赋值
        c.setAge(-10);       //可以尝试将setAge设置成负值（eg:-10），在setAge方法没有if语句判断前，结果负数还是可以运行
        //读数
        System.out.println("调用set和get方法后，读取的age："+c.getAge());
    }
}
