package com.zkrmain.stringgather;

import java.util.stream.IntStream;

/**
 * @author LG
 * @date 2020/12/18 - 11:31
 * @Motto "人生能有几回搏！！！Good Luck Me"
 */
public class SlicpStringTo {
    public static void main(String[] args) {
        test5();
    }


    public static void test5(){
        Double str = 30.14;
        System.out.println("DOUBLE" + str);
        String x = String.valueOf(str);
        System.out.println(x);

    }


    public static void test4(){
        String str = "";
        if (null != str && "".equals(str)){
            System.out.println(str+"参数为空");
        }
        System.out.println(str=="");

    }
    /**
     * replaceAll和replace字符串替换
     * trim 取消前后空格
     */
    public static void test3(){
        String str = "  我爱,中国   ";
        System.out.println(str);
        System.out.println(str.trim());
        System.out.println(str.replaceAll(",", "-"));
        System.out.println(str.replace(",", "+"));
    }
    /**
     * java8 befor
     */
    public static void test1(){
        System.out.println("Get set...");
        for (int i = 0; i < 4; i++) {
        System.out.println(i+"...");
        }
    }

    /**
     * java8 todday
     */
    public static void test2(){
        System.out.println("Get set...");
        IntStream.range(0,4).forEach(i-> {
            IntStream.range(0,i-1).forEach(j->{

            });
        });
    }







}
