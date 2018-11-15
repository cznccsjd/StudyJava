import java.util.*;

public class HashMapDemo {
    public static void main(String[] args){
//        HashMap hm=new HashMap();
        HashMap<Object,Object> hm=new HashMap<Object, Object>();
        hm.put("J","java");
        hm.put("P","python");
        hm.put("G","Go");
        hm.put("PH","PHP");
        //Map集合中，不能出现重复键，如果有重复，会直接覆盖原有key的value值
        hm.put("P","PHP");
        // 每一个键最多只能映射一个值，映射多个值时编译报错
//        hm.put("C","C++","C#");

        //通过键获取值V get(key)传递一个键，返回这个键对应的值；如果集合中没有这个键，返回null
//        System.out.println(hm.get("C"));
        //boolean containsKey(Key)判断集合中有没有这键，有返回true，没有返回false
//        System.out.println(hm.containsKey("l"));
        //boolean containsValue(Value)判断集合中有没有这个值，有返回true，没有返回false
//        System.out.println(hm.containsValue("Python"));
        //boolean isEmpty()如果集合中，没有键值对返回真，否则返回假
//        System.out.println(hm.isEmpty());
        //V remove(Key)根据键移除，这个键值对，返回移除之前的值,没有移除成功返回null
//        System.out.println(hm.remove("P"));

        //Collection<V> values()将Map中的所有值，存储到Collection集合
        //取出所有value值
        /*
        System.out.println("所有的值："+hm.values());
//        System.out.println(getType(hm.values()));     //报错，注释掉

        Collection value = hm.values();
        for (Object v:value){
            System.out.println("Collection集合中的values值："+v);
//            System.out.println("Collection集合中values的类型："+getType(v));     // 报错，注释掉
        }
*/

        //输出所有的key值
//        Set set=hm.keySet();
//        for(Object s:set){
//            System.out.println(s);
//        }

        //输出key和value值，输出的结果是 key=value
//        Set setKeyValue = hm.entrySet();
//        for(Object o:setKeyValue){
//            System.out.println(o);
//        }

        //下面这段有问题，跳过本段
/*        Set set=hm.entrySet();*/        //有问题，不能时使用
        Set<Map.Entry<Object,Object>> entires = hm.entrySet();
        Iterator iterator=entires.iterator();
        /*  下面的while语句，不能把Key跟Value分离出来，有问题；
        while (iterator.hasNext()){
            Object key = iterator.next();
            System.out.println("key是："+key);
            System.out.println("value是："+hm.get(key));
        }*/
        //下面的for是其中一种可以把key value分离出来的代码；跟下面是重复的
/*        for(Map.Entry<Object,Object> c:entires){
            System.out.println(c.getKey());
            System.out.println(c.getValue());
        })*/

        //另外一种可以把key和value分离出来的代码，跟下面是重复的
        Iterator<Object> itera = hm.keySet().iterator();
        while(itera.hasNext()){
            Object key = itera.next();
            Object value = hm.get(key);
            System.out.println(key);
            System.out.println(value);
        }
        //看这里的代码，map多用于存放成对出现的
//        Set<Map.Entry<Object,Object>> entries = hm.entrySet();
//        for (Map.Entry<Object,Object> c:entries){
//            System.out.println("key是："+c.getKey());
//            System.out.println("value是："+c.getValue());
//        }

 /*       //另一种遍历key value的方法
        Iterator<Object> iterator = hm.keySet().iterator();

        while (iterator.hasNext()){
            Object key = iterator.next();
            Object val = hm.get(key);
            System.out.println("key是："+key);
            System.out.println("value是："+val);
        }*/

    }
}
