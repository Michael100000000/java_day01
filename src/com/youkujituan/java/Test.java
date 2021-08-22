package com.youkujituan.java;

import com.youkujituan.bean.Customer;

import java.util.ArrayList;

/**
 * @author mason
 * @date 2021/8/22 - 15:59
 *
 * 1.IDEA中代码模块所处的位置：settings - Editor - Live Templates /Postfix Completions
 * 2.常用的模板
 */
public class Test {

    //模板6：prsf: 可生成 private static final
    private static final Customer CUST = new Customer();

    //变形:psf
    public static final int M=8;


    //变形:psfi
    public static final int MM=99;

    //变形:psfs
    public static final String MMM="999";


    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("Hello");
        //变形：soutp/soutm/soutv/xxx.out


        //模板三：fori
        String[] arr = new String[]{"tom","jerry","hanmeimei","lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //变形:iter
        for (String s : arr) {
            System.out.println(s);
        }

        //变形:itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }


        //模板3a:list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(12);
        list.add(1);

        for (Object o : list) {
            
        }
        
        //变形:list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        
        //变形:list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

        //模板5：ifn
        if (list == null) {
            
        }
        
        //变形:inn
        if (list != null) {

        }

        //变形:xxx.nn,xxx.null
        if (list != null) {

        }

        if (list == null) {

        }


    }
    public void method(){
        System.out.println("Test.method");
        


    }
}








































