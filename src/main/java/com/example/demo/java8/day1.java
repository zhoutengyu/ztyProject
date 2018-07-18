package com.example.demo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by admin on 2018/6/15.
 */
public class day1 {
    public static void main(String[] args) {
        //1.静态方法引用：ClassName::methodName
        List<Integer> ints = Arrays.asList(2, 1, 3);
        ints.sort(Integer::compare);
        //2.实例上的实例方法引用 instanceReference::methodName，方法引用使用”::”定义，
        // ”::”的前半部分表示类名或者实例名，后半部分表示方法名称。如果是构造函数，则使用new表示。
        ints.forEach(System.out::println);
        //断言函数
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        evaluate(list,s->true);
        System.out.println("-----------------------");
        evaluate(list,s->s % 2==0);
        System.out.println("-----------------------");
        evaluate(list,s->s % 2==1);
        System.out.println("-----------------------");
        evaluate(list,s->s>4);


    }
    public static void evaluate(List<Integer> list, Predicate<Integer> predicate){
        for (Integer i:list) {
            if(predicate.test(i)){
                System.out.print(i+"");
            }
        }

    }
}
