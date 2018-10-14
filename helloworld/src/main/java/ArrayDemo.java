import java.util.ArrayList;
import java.util.List;

/**
 * @author
 */
public class ArrayDemo {
    public static void main(String[] args){
        /*  第一种定义数组的方式
        //创建长度为5的int数组
        int [] a=new int[5];    //等号左边int []:int数组中存储的数据类型； 等号右边new int[5]:new创建一个具体的实体对象，创建一个具体int类型的数组容器
        System.out.println(a.length);
        for (int x:a){
            System.out.println(x);
        }

        String [] str=new String[6];    //定义长度为6的string类型的数组
        System.out.println(str.length);
        for (String s:str){
            System.out.println(s);
        }
        */

        /* 第二种定义数组的格式
        int [] a=new int[]{1,2,3,4,5,6,7,8,9};

        System.out.println("a数组的长度是："+a.length);
        for (int x:a){
            System.out.println(x);
        }

        String [] str=new String[]{"java","php","python","go"};
        System.out.println("str数组的长度是："+str.length);
        for(String s:str){
            System.out.println(s);
        }
        */


        /*第三种数组定义格式
        int [] a={1,2,3,4,5,6,7,8};
        System.out.println("int a数组的长度是："+a.length);
        for(int x:a){
            System.out.println(x);
        }

        String [] str={"China","Japan","Kereo"};
        System.out.println("String str数组的长度是："+str.length);
        for (String s:str){
            System.out.println(s);
        }
        */

        //通过下标获取指定的数组，下标从0开始
//        int [] a={10,12,13,14,15};
//        System.out.println("下标第5个值："+a[4]);   //获取数组第5个数字；
//
//        for(int i=0;i<a.length;i++){
//            //获取下标值
//            System.out.println("当前下标为："+i);
//            //获取每一个下标所指定的值
//            System.out.println("当前第"+i+"个下标的值为："+a[i]+"\n");
//        }

        ArrayList ar=new ArrayList();
        ar.add("aa");
        ar.add(1);
        ar.add(34);
        ar.add("yes");
        ar.add(324);
        ar.add("oh");
        ar.add(2);
        ar.add("set");
        for (Object c:ar){
            System.out.println("ArrayList对象："+c);
        }
//        获取list元素对象
//        System.out.println("获取list第0个元素："+ar.get(0));
//        移除指定角标的值
//        ar.remove(0);
//        for(Object cc:ar){
//            System.out.println("remove后的list："+cc);
//        }

//        元素的修改
//        ar.set(0,"java");
//        for(Object ccc:ar){
//            System.out.println("修改后的list："+ccc);
//        }

//        获取集合的一部分
        List list = ar.subList(0,4);
        for(Object ll:list){
            System.out.println("获取集合值："+ll);
        }

    }
}
