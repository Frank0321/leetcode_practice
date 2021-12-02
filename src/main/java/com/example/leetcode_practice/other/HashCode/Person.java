package com.example.leetcode_practice.other.HashCode;


import java.util.Objects;

public class Person {

  private int id;

  private String name;

  Person(int id, String name){
    this.id = id;
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return id == person.id && Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }
}
