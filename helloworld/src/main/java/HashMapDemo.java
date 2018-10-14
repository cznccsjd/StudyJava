import java.util.*;

public class HashMapDemo {
    public static void main(String[] args){
//        HashMap hm=new HashMap();
        HashMap<Object,Object> hm=new HashMap<Object, Object>();
        hm.put("J","java");
        hm.put("P","python");
        hm.put("G","Go");
        hm.put("PH","PHP");

//        System.out.println(hm.get("P"));    //取出指定值

        //取出所有value值
        /*
        Collection value = hm.values();
        for (Object v:value){
            System.out.println(v);
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
//        Set set=hm.entrySet();
//        Iterator iterator=set.iterator();
//        while (iterator.hasNext()){
//            Object key = iterator.next();
//            System.out.println("key是："+key);
//            System.out.println("value是："+hm.get(key));
//        }

        //看这里的代码，map多用于存放成对出现的
//        Set<Map.Entry<Object,Object>> entries = hm.entrySet();
//        for (Map.Entry<Object,Object> c:entries){
//            System.out.println("key是："+c.getKey());
//            System.out.println("value是："+c.getValue());
//        }

        //另一种遍历key value的方法
        Iterator<Object> iterator = hm.keySet().iterator();

        while (iterator.hasNext()){
            Object key = iterator.next();
            Object val = hm.get(key);
            System.out.println("key是："+key);
            System.out.println("value是："+val);
        }

    }
}
