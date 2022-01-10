package com.example.leetcode_practice.Interview.univ;

/**
 * FileName : StacticTest
 * CreatTime : 2022/1/10
 * Author : Frank.Chang
 * Description :
 */
public class StacticTest {
    public static void main(String[] args) {
        A a2 = new C();
        a2.printStatic();
    }
}

class A {
    static {
        System.out.println("class 'A' object" );
    }
    static public void printStatic(){
        System.out.println("class 'A' printStatic");
    }
}

class C extends A{
    static {
        System.out.println("class 'C' object");
    }
    static public void printStatic(){
        System.out.println("class 'C' printStatic");
    }
}

