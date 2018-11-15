import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * 集合的学习文件，Array部分
 */
public class ArrayDemo {
    public static void main(String[] args){
//        第一种定义数组的方式
        /*
        //创建长度为5的int数组
        int [] a=new int[5];    //等号左边int []:int数组中存储的数据类型； 等号右边new int[5]:new创建一个具体的实体对象，创建一个具体int类型的数组容器
        System.out.println("int数组a的长度："+a.length);
        for (int x:a){
            System.out.println("int数组的具体元素："+x);            //因为没有赋值，所以打印出来的都是0
        }

        String [] str=new String[6];    //定义长度为6的string类型的数组
        System.out.println("string数组的长度："+str.length);
        for (String s:str){
            System.out.println("string数组的具体元素："+s);     //因为没有赋值，所以打印出来的都是null
        }*/


        // 第二种定义数组的格式       定义的时候，直接赋值
        /*
        int [] a=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println("int数组的长度是："+a.length);
        for (int x:a){
            System.out.println("int数组的具体元素是："+x);
        }

        String [] str=new String[]{"java","php","python","go"};
        System.out.println("str数组的长度是："+str.length);
        for(String s:str){
            System.out.println("str数组的具体元素是："+s);
        }*/



        //第三种数组定义格式     直接定义，右面不需要new 类型了，这种格式用的最多
        /*
        int [] a={1,2,3,4,5,6,7,8};
        System.out.println("int a数组的长度是："+a.length);
        for(int x:a){
            System.out.println("int数组的具体元素是："+x);
        }

        String [] str={"China","Japan","Kereo"};
        System.out.println("String str数组的长度是："+str.length);
        for (String s:str){
            System.out.println("str数组的具体元素是："+s);
        }*/


        //通过下标获取指定的数组，下标从0开始
        /*
        int [] a={10,12,13,14,15};
        System.out.println("下标第5个值："+a[4]);   //获取数组第5个数字；

        for(int i=0;i<a.length;i++){
            //获取下标值
            System.out.println("当前下标为："+i);
            //获取每一个下标所指定的值
            System.out.println("当前第"+(i+1)+"个元素的值为："+a[i]+"\n");        //注意换行符需要加""
        }*/


        //ArrayList是List接口的实现类
        ArrayList ar=new ArrayList();
        //void add(int index,Object o)在列表的指定位置上插⼊元素，index从0开始计数
        ar.add("aa");
        ar.add(1);
        ar.add(34);
        ar.add("yes");
        ar.add(324);
        ar.add("oh");
        ar.add(2);
        ar.add("set");
        ar.add(1,"the second");
        ar.add(3,"the fourth");
//        System.out.println("ArrayList全部对象："+ar);
//        for (Object c:ar){
//            System.out.println("ArrayList单个对象："+c);
//        }

/*        //获取list元素对象，Object get(int index)返回指定索引上的元素！
       System.out.println("获取list第0个元素："+ar.get(0));*/
/*        //移除指定角标的值，Object remove(int index)移除指定下标上的元素，返回移除前的对象
        ar.remove(0);
        for(Object cc:ar){
            System.out.println("remove后的list："+cc);
        }*/

/*        //元素的修改,Object set(int index,Object o)修改指定下标上的元素，返回修改前的元素
        ar.set(0,"java");
        for(Object ccc:ar){
            System.out.println("修改后的list："+ccc);
        }*/


/*        //获取集合的一部分,List subList(int start,int end)获取集合中的⼀部分，包含头，不包含尾，返回新集合
        List list = ar.subList(0,4);
        for(Object ll:list){
            System.out.println("获取集合值："+ll);
        }*/



    }
}
