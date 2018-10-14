public class HelloWorld {

    public static void main(String []args) {
        int a = 3;
        boolean t = true;
        String str = "hello world!";
        //这是单行注释
        /*  这是多行注释
        line 1
        line2
         */
        /*
        System.out.println(a);
        System.out.println(t);
        System.out.println(str);
        */

        //if条件语句
//        if (a > 5) {
//            System.out.println("a大于5了");
//        } else if(a==3){
//            System.out.println("a 等于 3了；");
//        }
//        else{
//            System.out.println("a小于5了");
//        }


//        循环语句
//        for(int b=0;b<10;b++){
//            System.out.println(b+" HelloWorld");
//        }

        /**
         * 作业，0-100，如果是大于40的数字，输出xx数字是大于40的，
         * 如果小于40的数字，输出xx数字是小于40的
         */
        for (int num=0;num<=100;num++){
            if(num<40){
                System.out.println(num+" less than 40;");
            }else if(num>40){
                System.out.println(num+" great than 40;");
            }else{
                System.out.println(num+" equal 40;");
            }
        }




    }
}
