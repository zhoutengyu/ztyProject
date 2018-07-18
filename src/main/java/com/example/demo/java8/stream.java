package com.example.demo.java8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by admin on 2018/6/15.
 */
public class stream {
    public static void main(String[] args) {
        //1.对于集合来说,直接通过stream()方法即可获取流对象
        List<Integer> list=new ArrayList<>();
        Stream<Integer> s1= list.stream();
        //2.对于数组来说,通过Arrays类提供的静态函数stream()获取数组的流对象
        String[] names = {"chaimm","peter","john"};
        Stream<String> s2=Arrays.stream(names);
        //3.直接将几个普通的数值变成流对象
        Stream<String> stream = Stream.of("chaimm","peter","john");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7,4,5,5);
        long i=nums.stream().filter(s->s>3).count();
        List<Integer> nums1=nums.stream().filter(s->s<5).collect(Collectors.toList());
        List<Integer> nums2=nums.stream().distinct().collect(Collectors.toList());
        //.skip(N)跳过前n个，limit(n)截取前n个
        List<Integer> nums3=nums.stream().limit(3).collect(Collectors.toList());
        //nums3.forEach(System.out::print);

        List<Student> students=new ArrayList<>();
        students.add(new Student("Jack","male",20));
        students.add(new Student("Bob","male",15));
        students.add(new Student("Jay","male",19));
        students.add(new Student("Alice","male",26));
        students.add(new Student("Mike","male",25));
        List<String> ns=students.stream().map(s->s.getName()).collect(Collectors.toList());
        //max获取最大，min最小
        Student maxage=students.stream().max(Comparator.comparing(s->s.getAge())).get();
        //求和方法一
        Integer countAge=students.stream().map(s->s.getAge()).reduce(0,(acc,sec)->acc+sec);
        //求和方法二,sum max min 类似
        countAge=students.stream().map(s->s.getAge()).reduce(0,Integer::sum);
        System.out.println(countAge);
        Double a=Math.ceil((double)10/3);
        System.out.println(a);
    }
}
