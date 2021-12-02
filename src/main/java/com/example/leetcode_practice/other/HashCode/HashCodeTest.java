package com.example.leetcode_practice.other.HashCode;

public class HashCodeTest {

  public static void main(String[] args) {
    Person p1 = new Person(1, "Frank");
    Person p2 = new Person(1, "Frank");
    System.out.println(p1.equals(p2));
  }

}


