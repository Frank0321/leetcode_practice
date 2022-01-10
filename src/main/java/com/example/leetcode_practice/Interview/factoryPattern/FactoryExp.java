package com.example.leetcode_practice.Interview.factoryPattern;

/**
 * FileName : FactoryExp
 * CreatTime : 2022/1/11
 * Author : Frank.Chang
 * Description :
 */
public class FactoryExp {
    public static void main(String[] args) {
        Person student = new Student();
        Person teacher = new Teacher();

        System.out.println(student.sayHi());
        System.out.println(student.word);

        System.out.println(teacher.sayHi());
        System.out.println(teacher.word);

    }
}


