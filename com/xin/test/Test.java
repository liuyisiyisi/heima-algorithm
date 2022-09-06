package com.xin.test;

import com.xin.sort.Student;

/**
 * @author liuyisiyisi
 * @date 2022-09-06 21:04
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(18);
        s1.setUsername("Messi");
        Student s2 = new Student();
        s2.setAge(21);
        s2.setUsername("Ronaldo");
        Comparable max = getMax(s1, s2);
        System.out.println(max);
    }

    public static Comparable getMax(Comparable c1, Comparable c2) {
        if (c1.compareTo(c2) > 0) {
            return c1;
        } else return c2;
    }
}
